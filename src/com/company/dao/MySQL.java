package com.company.dao;
import java.sql.*;


public class MySQL {
    private static Connection connection = null;

    private static String url = "jdbc:mysql://localhost:3306/";
    private  static String user = "root";
    private static String pass = "";
    private static String db = "fat";


    public static Connection getConnection() {
        if (connection==null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                connection = DriverManager.getConnection(url + db, user, pass);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return connection;


    }

}