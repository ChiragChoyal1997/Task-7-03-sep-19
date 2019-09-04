package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateOperation {
    public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root", "root");
            String sql = "create table worker("
                    + "wno int not null primary key,"
                    + "wname varchar(45),"
                    + "sal float"
                    + ")";
            Statement stmt = con.createStatement();
            stmt.execute(sql);
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
