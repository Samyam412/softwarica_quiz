package com.softwarica;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static com.softwarica.Quiz.score;
import static org.junit.jupiter.api.Assertions.*;

class databaseTest {


    private Object Assertion;

    @org.junit.jupiter.api.Test
    void testInsert() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Softwarica_quiz", "root", "Samyam2896");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        Statement stmt = connection.createStatement();
//        String query = "insert into username(user,score) values ('" + username + "'," + score + ");";
//        System.out.println(query);
        String username;
        stmt.execute("insert into username(user,score) values ('" + username + "'," + score + ");");
        Assertion.AreEqual(testInsert());

    }
}