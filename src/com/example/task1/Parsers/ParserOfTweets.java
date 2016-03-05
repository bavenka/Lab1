package com.example.task1.Parsers;

import com.example.task1.Tweets;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Павел on 03.03.2016.
 */
public class ParserOfTweets implements Iparser<Tweets,String> {
    @Override
    public Tweets parse(String sent) {
        Tweets tweet = new Tweets();
        String s;
        Pattern p1 = Pattern.compile("\\d{2}\\.\\d+,");
        Matcher matcher = p1.matcher(sent);
        while (matcher.find()) {
            s = matcher.group();
            tweet.setLatitude(Double.parseDouble(s.substring(0, s.length() - 1)));
        }
        Pattern p2 = Pattern.compile("\\-?\\d{2,3}\\.\\d+");
        Matcher matcher2 = p2.matcher(sent);
        while (matcher2.find()) {
            tweet.setLongitude(Double.parseDouble(matcher2.group()));
        }
        Pattern p4 = Pattern.compile("[a-zA-Z#@].*");
        Matcher matcher4 = p4.matcher(sent);
        while (matcher4.find()) {
            tweet.setText(matcher4.group());
        }
        try {
            Pattern p3 = Pattern.compile("(\\d{4}(\\-\\d{2}){2}) (\\d{2}(:\\d{2}){2})");
            Matcher matcher3 = p3.matcher(sent);
            while (matcher3.find()) {
                sent = matcher3.group();
            }
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            tweet.setDate(formatter.parse(sent));

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return tweet;
    }
}
