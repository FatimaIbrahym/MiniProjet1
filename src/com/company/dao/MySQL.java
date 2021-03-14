package com.company.dao;
import java.sql.*;


public class MySQL {
    private Connection connection = null;
    private Statement statement =  null;
    private ResultSet resultSet = null;

    private String url = "jdbc:mysql://localhost:3306/";
    private String user = "root", pass = "";
    private String db = "miniProjet1";

    public MySQL() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(url + db, user, pass);
        statement = connection.createStatement();

    }

}