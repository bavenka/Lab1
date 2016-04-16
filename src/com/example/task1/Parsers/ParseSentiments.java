package com.example.task1.Parsers;

import com.example.task1.Lines.Sentiments;

/**
 * Created by Павел on 03.03.2016.
 */
public class ParseSentiments implements  IParse<Sentiments,String>{
    @Override
    public Sentiments parse(String sent) {
        Sentiments sentiment = new Sentiments();
        String[] elements = sent.split(",");
        sentiment.setWord(elements[0]);
        sentiment.setDigit(Double.parseDouble(elements[1]));
        return sentiment;
    }
}
