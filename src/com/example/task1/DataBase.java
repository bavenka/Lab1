package com.example.task1;

import com.example.task1.Lines.Tweets;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Павел on 02.05.2016.
 */
public class DataBase {
    private static Connection connection;
    private static Statement statement;

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

    public static void addInfo(Connection connection, ArrayList<Tweets> allTweets) throws SQLException {
        statement=connection.createStatement();
       // String query="insert into database.tweets(latitude, longitude, data ,text) values(?,?,?,?)";
        for(int i=0;i<allTweets.size();i++){
            statement.executeUpdate("insert into database.tweets(latitude, longitude, data ,text) values("+allTweets.get(i).getLatitude()+","+allTweets.get(i).getLongitude()+",'"+new Date(allTweets.get(i).getDate().getTime())+"','"+allTweets.get(i).getText()+"')");
        }



        //String info = "insert into database.tweets(Latitude, Longitude, Date ,Text) values(25.4,34.8,'2008-02-02','sgfdhhdd')";
        //statement = connection.createStatement();
       // statement.executeUpdate(info);
    }

    public static void deleteInfo() throws SQLException {
        String info = "DELETE from database.tweets WHERE id = 1";
        statement = getDBConnection().createStatement();
        statement.execute(info);
    }

    public static void updateInfo() throws SQLException {
        String info = "UPDATE database.tweets SET Latitude = 30.0 WHERE id=1";
        statement = getDBConnection().createStatement();
        statement.execute(info);
    }

    public static void getInfo() throws SQLException {
        String info = "SELECT id, Latitude, Longitude, dates, Text FROM database.tweets";
        statement = getDBConnection().createStatement();
        ResultSet rs = statement.executeQuery(info);
        while (rs.next()) {
            int id = rs.getInt("id");
            Double latitude = rs.getDouble("Latitude");
            Double longitude = rs.getDouble("Longitude");
            Date date = rs.getDate("dates");
            String text = rs.getString("Text");
            System.out.print("ID: " + id);

            System.out.print(", Age: " + latitude);
            System.out.print(", First: " + longitude);
            System.out.println(", Last: " + date);
            System.out.println(", Last: " + text);

        }
    }
}

