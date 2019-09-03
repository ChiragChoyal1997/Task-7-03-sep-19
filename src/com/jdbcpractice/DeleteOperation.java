package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root", "root");
            String sql = "delete from employee where eno=?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            System.out.println("Provide employee number to delete");
            int eno = sc.nextInt();
            pstmt.setInt(1, eno);
            int i = pstmt.executeUpdate();
            if(i == 1){
                System.out.println("Employee account deleted !");
            }
            else{
                System.out.println("Employee account not found or mismatched");
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
