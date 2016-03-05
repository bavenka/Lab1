package com.example.task1.Readers;

import com.example.task1.Parsers.ParserOfSentiments;
import com.example.task1.Parsers.ParserOfStates;
import com.example.task1.Parsers.ParserOfTweets;
import com.example.task1.Sentiments;
import com.example.task1.States;
import com.example.task1.Tweets;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

public class Show {
    private static ArrayList<String> lines;
    private static String str;
    public static void getTweets(){
        ArrayList<Tweets> allTweets = new ArrayList<Tweets>();
        lines = Read.readStrings("C:\\Users\\Павел\\IdeaProjects\\Lab1\\src\\com\\example\\task1\\Files\\all_tweets.txt",2,7);
        for (String s : lines) {
            ParserOfTweets parser = new ParserOfTweets();
            allTweets.add(parser.parse(s));
        }
        for(Tweets s:allTweets){
            System.out.println(s.toString());
        }
    }

    public static void getSentiments(){
        ArrayList<Sentiments> allSentiments = new ArrayList<Sentiments>();
        lines = Read.readStrings("C:\\Users\\Павел\\IdeaProjects\\Lab1\\src\\com\\example\\task1\\Files\\sentiments.csv",2,7);
        for (String s : lines) {
            ParserOfSentiments parser = new ParserOfSentiments();
            allSentiments.add(parser.parse(s));
        }
        for(Sentiments s:allSentiments){
            System.out.println(s.toString());
        }
    }

    public static void getStates(){
        ArrayList<States> allStates = new ArrayList();
        str=Read.readAll("C:\\Users\\Павел\\IdeaProjects\\Lab1\\src\\com\\example\\task1\\Files\\states.json");
        JSONObject json = new JSONObject(str);
        Iterator<String> keys = json.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            ParserOfStates parserOfStates = new ParserOfStates();
            States state = parserOfStates.parse(json.getJSONArray(key));
            state.setName(key);
            allStates.add(state);
        }
        for(States a:allStates){
            System.out.println(a.toString());
        }
    }
}
