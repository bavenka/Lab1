package com.example.task1.Generate;
import com.example.task1.Lines.Tweets;

import java.util.ArrayList;

/**
 * Created by Павел on 23.03.2016.
 */

public class GenerateTweets implements IGenerateFirst<ArrayList<Tweets>,String> {
@Override
    public ArrayList<Tweets> generate(ArrayList<Tweets> allTweets,String input){
        ArrayList<Tweets> listTweets=new ArrayList();
       for(Tweets t:allTweets){
           if(t.toString().contains(input)){
               listTweets.add(t);
           }
       }
        return listTweets;
    }
}
