package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertOperation {
    public static void main(String[] args) {
        Connection con = null;
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root", "root");
            System.out.println("Insert details of employee");
            System.out.println("Enter employee name");
            String ename = sc.nextLine();
            System.out.println("Enter salary of employee");
            float sal = sc.nextFloat();
            String sql = "insert into employee(ename,sal) values(?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, ename);
            stmt.setFloat(2, sal);
            int i = stmt.executeUpdate();
            if(i == 1){
                System.out.println("Record Inserted !");
            }
            else{
                System.out.println("Unable to insert record");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        finally{
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
    }
}
