package com.example.task1.Generate;

import com.example.task1.Lines.Sentiments;
import com.example.task1.Lines.Tweets;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Павел on 27.03.2016.
 */
public class GenerateSentiments implements IGenerateSecond.IGenerateFirst<Double,Date,ArrayList<Tweets>,ArrayList<Sentiments>> {
    @Override
    public Double generate(Date time_1, Date time_2, ArrayList<Tweets> allTweets, ArrayList<Sentiments> sentiments) {
        ArrayList<Tweets> listTweets = new ArrayList();
        Double sentimentsWeight = 0.0;
        for (Tweets t : allTweets) {
            if (t.getDate().after(time_1) && t.getDate().before(time_2)) {
                listTweets.add(t);
            }

            for (int i = 0; i < listTweets.size(); i++) {
                for (int j = 0; j < sentiments.size(); j++) {
                    if (listTweets.get(i).getText().contains(sentiments.get(j).getWord()))

                        sentimentsWeight += sentiments.get(j).getDigit();
                }
            }
        }
        return sentimentsWeight;
    }
}


