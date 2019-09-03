package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateOperation {
    public static void main(String[] args) {
        Connection con = null;
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root", "root");
            String sql = "update employee set sal=? where eno=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            System.out.println("Enter employee no., Whose salary is to be updated");
            int eno = sc.nextInt();
            System.out.println("Enter new updated salary");
            float sal = sc.nextFloat();
            stmt.setFloat(1, sal);
            stmt.setInt(2, eno);
            int i = stmt.executeUpdate();
            
            if(i == 1){
                System.out.println("Salary of employee updated");
            }
            else{
                System.out.println("Salary is not updated/maybe employee not found");
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
