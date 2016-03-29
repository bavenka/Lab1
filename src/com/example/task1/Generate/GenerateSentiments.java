package com.example.task1.Generate;

import com.example.task1.Readers.Describe;
import com.example.task1.Sentiments;
import com.example.task1.Tweets;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Павел on 27.03.2016.
 */
public class GenerateSentiments implements IGenerate<Double,String,ArrayList<Tweets>,ArrayList<Sentiments>> {
    @Override
    public Double generate(String time,ArrayList<Tweets> allTweets,ArrayList<Sentiments>allSentiments){

        ArrayList<Tweets>selectionTweets=new ArrayList();
        Double sentimentsWeight=0.0;
        for(Tweets t:allTweets){
            if(t.toString().contains(time)){
                selectionTweets.add(t);
            }
        }

        for(int i=0;i<selectionTweets.size();i++){
            for(int j=0;j<allSentiments.size();j++){
                int index = allSentiments.get(j).toString().indexOf(",");
                if (selectionTweets.get(i).toString().toLowerCase().contains(allSentiments.get(j).toString().substring(0, index))) {
                    sentimentsWeight += Double.parseDouble(allSentiments.get(j).toString().substring(index+1));
                }
            }
        }
        return sentimentsWeight;
    }
}
