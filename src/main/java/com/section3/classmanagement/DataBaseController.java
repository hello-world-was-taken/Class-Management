package com.section3.classmanagement;

import java.sql.*;
public class DataBaseController {
    

    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classschedule", "root", "");
    Statement statement = connection.createStatement();
    ResultSet resultSet = null;
    public DataBaseController() throws SQLException {
    }

    public void checkCredential() throws SQLException {
        resultSet = statement.executeQuery("select * from admin;");

        while(resultSet.next()) {
            String Admin_ID = resultSet.getString("Admin_ID");
//            int password = resultSet.getInt("password");
            String Admin_Name = resultSet.getString("Admin_Name");

            System.out.println("Admin_ID: " + Admin_ID);
            System.out.println("Password: " + Admin_Name);
        }
    }
}
