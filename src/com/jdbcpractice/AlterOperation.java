package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterOperation {
    public static void main(String[] args) {
        Connection con = null;
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root", "root");
            System.out.println("Renaming Table column");
            System.out.println("Enter column name in employee");
            String oldname = sc.nextLine();
            System.out.println("Enter new name of column");
            String newname = sc.nextLine();
            String sql = "ALTER TABLE employee RENAME COLUMN "+oldname+" to "+newname;
            
            PreparedStatement stmt = con.prepareStatement(sql);
            System.out.println(sql);
            stmt.executeUpdate();
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
