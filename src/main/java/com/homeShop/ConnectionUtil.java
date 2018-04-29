package com.homeShop;


import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Resource(name = "jdbc/db")
public class ConnectionUtil {

    private final static String URL =
            "jdbc:mysql://localhost:3306/mydb?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true" +
                    "&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "new_password";
    private static Connection connection;

    public ConnectionUtil() {
    }

    public static Connection getConnection() {
        if (connection != null) return connection;
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            return connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
