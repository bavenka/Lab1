package com.example.task1.DataBase;

import com.example.task1.Lines.Sentiments;
import com.example.task1.Lines.States;
import com.example.task1.Lines.Tweets;
import org.javatuples.Triplet;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Павел on 02.05.2016.
 */
public class ConnectDB {
    private static Connection connection;
    private static PreparedStatement preparedStatement;

    public static Connection getDBConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Драйвер не найден!");
        }
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");
            return connection;
        } catch (SQLException e) {
            System.out.println("Соединение с БД не установлено!");
        }
        return null;
    }






}

