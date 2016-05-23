package com.example.task1.Generate;

import com.example.task1.Lines.Tweets;

import java.util.ArrayList;

/**
 Class is used to implement the interface
 * @see IGenerate
 */
public class GenerateSentiments implements IGenerate<Double,DescribeGenerateSentiments> {
    @Override

    /**
     * Implementation of the second report
     * @see IGenerate#generate(Object)
     */
    public Double generate(DescribeGenerateSentiments obj) {
        ArrayList<Tweets> listTweets = new ArrayList();
        Double sentimentsWeight = 0.0;
        for (Tweets t : obj.getListTweets()) {
            if (t.getDate().after(obj.getStart()) && t.getDate().before(obj.getFinish())) {
                listTweets.add(t);
            }

            for (int i = 0; i < listTweets.size(); i++) {
                for (int j = 0; j < obj.getListSentiments().size(); j++) {
                    if (listTweets.get(i).getText().contains(obj.getListSentiments().get(j).getWord()))

                        sentimentsWeight += obj.getListSentiments().get(j).getDigit();
                }
            }
        }

        return sentimentsWeight;
    }
}


