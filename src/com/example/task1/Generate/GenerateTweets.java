package com.example.task1.Generate;
import com.example.task1.Readers.Describe;
import com.example.task1.Sentiments;
import com.example.task1.Tweets;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Павел on 23.03.2016.
 */

public class GenerateTweets implements IGenerate<ArrayList<Tweets>,String,ArrayList<Tweets>,ArrayList<Sentiments>> {
@Override
    public ArrayList<Tweets> generate(String input,ArrayList<Tweets> tweets,ArrayList<Sentiments> sentiments){
        ArrayList<Tweets> selectionTweets=new ArrayList();
       for(Tweets t:tweets){
           if(t.toString().contains(input)){
               selectionTweets.add(t);
           }
       }
        return selectionTweets;
    }
}
