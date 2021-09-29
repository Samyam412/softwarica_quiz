package com.softwarica;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class database {
    public static void insert(int score,String username) throws SQLException, ClassNotFoundException {


        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Softwarica_quiz", "root", "Samyam2896");
        Statement stmt = connection.createStatement();
//        String query = "insert into username(user,score) values ('" + username + "'," + score + ");";
//        System.out.println(query);
        stmt.execute("insert into username(user,score) values ('" + username + "'," + score + ");");
    }
}
