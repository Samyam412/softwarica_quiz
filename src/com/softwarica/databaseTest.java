package com.softwarica;


import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static com.softwarica.Quiz.score;


class databaseTest {


    private Object Assertion;

    @Test
    Object testInsert() throws ClassNotFoundException, SQLException {
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
        String username = null;
        stmt.execute("insert into username(user,score) values ('" + username + "'," + score + ");");
        Assertion.equals(testInsert());

        return null;
    }
}