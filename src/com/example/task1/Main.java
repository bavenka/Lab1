package com.example.task1;

import com.example.task1.Parsers.Parser;
import com.example.task1.Readers.Read;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {


    public static void main(String[] args) {
//        ArrayList<Tweets> allTweets = new ArrayList<>();
//        ArrayList<Sentiments> allSentiments=new ArrayList<Sentiments>();
//        ArrayList<String> strings = Read.readStrings(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        ArrayList<States> allStates = new ArrayList();
      String str=Read.readAll("C:\\Users\\Павел\\IdeaProjects\\Lab1\\src\\com\\example\\task1\\states.json");
            JSONObject json = new JSONObject(str);
            Iterator<String> keys = json.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                Parser parser = new Parser();
                States state = parser.parseStates(json.getJSONArray(key));
                state.setName(key);
                allStates.add(state);
            }
        for(States a:allStates){
            System.out.println(a.toString());
        }
    }




//        for(String s:strings){
//            Parser parser=new Parser();
//            allTweets.add(parser.parseTweets(s));
//        }
//        for(Tweets s:allTweets){
//            System.out.println(s.toString());
//        }
//       for(String s:strings){
//            Parser parser=new Parser();
//            allSentiments.add(parser.parseSentiments(s));
//        }
//        for(Sentiments s:allSentiments){
//            System.out.println(s.toString());
//        }
//


}
