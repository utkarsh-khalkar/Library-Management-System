package com.company.librarymanagement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

    public DatabaseUtil()
    {}

    public static Connection getJDBCConnection() throws SQLException {
        Connection connection=null;

        // Established the Connection.
       // String url="jdbc:mysql://localhost:3306/library_management";
        String url="jdbc:mysql://localhost:3306/library_management";
        String user="root";
        String pass="12345";
        connection= DriverManager.getConnection(url,user,pass);
        if (connection !=null)
            return connection;
        return connection;

    }

}
