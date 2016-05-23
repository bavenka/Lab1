package com.example.task1.DataBase;

import com.example.task1.Lines.Sentiments;
import com.example.task1.Lines.States;
import com.example.task1.Lines.Tweets;

import java.sql.*;

/**
 * Created by Павел on 16.05.2016.
 */
public class GetInfo {
private static PreparedStatement preparedStatement;
//    public static void getTweets(Connection connection) throws SQLException {
//        String info = "SELECT id, latitude, longitude, data, text FROM database.tweets";
//        preparedStatement = connection.prepareStatement(info);
//        ResultSet rs = preparedStatement.executeQuery();
//        while (rs.next()) {
//            Double latitude = rs.getDouble("latitude");
//            Double longitude = rs.getDouble("longitude");
//            Date date = rs.getDate("data");
//            String text = rs.getString("text");
//            System.out.println(new Tweets(latitude,longitude,date,text));
//        }
//    }

    public static void getSentiments(Connection connection) throws SQLException {
        String info = "SELECT emotion, weight FROM database.sentiments";
        preparedStatement = connection.prepareStatement(info);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            String emotion = rs.getString("emotion");
            Double weight = rs.getDouble("weight");
            System.out.println(new Sentiments(emotion,weight));
        }
    }

    public static void getStates(Connection connection) throws SQLException {
        String info = "SELECT state, digit,latitude,longitude FROM database.states";
        preparedStatement = connection.prepareStatement(info);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            String state = rs.getString("state");
            Integer group = rs.getInt("digit");
            Double latitude=rs.getDouble("latitude");
            Double longitude=rs.getDouble("longitude");
            System.out.println(new States(state,group,latitude,longitude));
        }
    }

    public static void doReport(Connection connection,String hashtag) throws SQLException{
        String info = "SELECT id, latitude, longitude, data, text FROM database.tweets WHERE text LIKE ?";
        preparedStatement=connection.prepareStatement(info);
        preparedStatement.setString(1,"%"+hashtag+"%");
        ResultSet rs=preparedStatement.executeQuery();
        while (rs.next()) {
            Double latitude = rs.getDouble("latitude");
            Double longitude = rs.getDouble("longitude");
            Date date = rs.getDate("data");
            String text = rs.getString("text");
            System.out.println(new Tweets(latitude,longitude,date,text));
        }
    }
}
