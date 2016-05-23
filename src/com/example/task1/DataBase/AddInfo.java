package com.example.task1.DataBase;

import com.example.task1.Lines.Sentiments;
import com.example.task1.Lines.States;
import com.example.task1.Lines.Tweets;
import org.javatuples.Triplet;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Павел on 16.05.2016.
 */
public class AddInfo {
    private static PreparedStatement preparedStatement;
    public static void addTweets(Connection connection, Tweets tweet) throws SQLException {
        String info="insert into database.tweets(latitude, longitude, data ,text) values(?,?,?,?);";
        preparedStatement= connection.prepareStatement(info);
        preparedStatement.setDouble(1,tweet.getLatitude());
        preparedStatement.setDouble(2,tweet.getLongitude());
        preparedStatement.setDate(3,new Date(tweet.getDate().getTime()));
        preparedStatement.setString(4,tweet.getText());
        preparedStatement.executeUpdate();
    }

    public static void addSentiments(Connection connection, Sentiments sentiment) throws SQLException {
        String info="insert into database.sentiments(emotion,weight) values(?,?);";
        preparedStatement= connection.prepareStatement(info);
        preparedStatement.setString(1,sentiment.getWord());
        preparedStatement.setDouble(2,sentiment.getDigit());
        preparedStatement.executeUpdate();
    }

    public static void addStates(Connection connection, States state) throws SQLException {
        String info="insert into database.states(state,digit,latitude,longitude) values(?,?,?,?);";
        preparedStatement= connection.prepareStatement(info);
        preparedStatement.setString(1,state.getName());
        for(Triplet<Integer,Double,Double> coordinate:state.getCoordinatesList()) {
            preparedStatement.setInt(2, coordinate.getValue0());
            preparedStatement.setDouble(3, coordinate.getValue1());
            preparedStatement.setDouble(4,coordinate.getValue2());
            preparedStatement.executeUpdate();
        }
    }
}
