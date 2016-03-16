package com.example.task1.Readers;

import com.example.task1.Parsers.IParse;
import com.example.task1.Parsers.ParseSentiments;
import com.example.task1.Parsers.ParseStates;
import com.example.task1.Parsers.ParseTweets;
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
        lines = Read.readStrings("C:\\Users\\Павел\\IdeaProjects\\Lab1\\src\\com\\example\\task1\\Files\\all_tweets.txt",900,1500);
        for(int i=0;i<lines.size()-1;i++){
            if(lines.get(i+1).toString().contains("-")){
                continue;
            }
            else {
                String temp= lines.get(i).concat(lines.get(i+1));
                lines.set(i,temp);
                lines.remove(i+1);
            }
        }
        for (String s : lines) {
            IParse<Tweets, String> parser = new ParseTweets();
            allTweets.add(parser.parse(s));
        }
        for(Tweets s:allTweets){
            System.out.println(s.toString());
        }
    }

    public static void getSentiments(){
        ArrayList<Sentiments> allSentiments = new ArrayList<Sentiments>();
        lines = Read.readStrings("C:\\Users\\Павел\\IdeaProjects\\Lab1\\src\\com\\example\\task1\\Files\\sentiments.csv",900,1000);
        for (String s : lines) {
           IParse <Sentiments,String> parser = new ParseSentiments();
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
            ParseStates parserOfStates = new ParseStates();
            States state = parserOfStates.parse(json.getJSONArray(key));
            state.setName(key);
            allStates.add(state);
        }
        for(States a:allStates){
            System.out.println(a.toString());
        }
    }
}
