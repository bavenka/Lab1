package com.example.task1.Generate;

import com.example.task1.Lines.Sentiments;
import com.example.task1.Lines.Tweets;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *The class used to describe the first report
 */
public class DescribeGenerateTweets {

    /** Property - hashtag */
    private String input;

    /** The property - a list of tweets containing the hashtag required */
    private ArrayList<Tweets>listTweets;

    /** Function to get the value field {@link DescribeGenerateTweets#listTweets}
     * @return Returns a list of tweets
     */
    public ArrayList<Tweets> getListTweets() {
        return listTweets;
    }

    /** The function for adjusting the field {@link DescribeGenerateTweets#listTweets}
     * @param listTweets-a list of all tweets
     */
    public void setListTweets(ArrayList<Tweets> listTweets) {
        this.listTweets = listTweets;
    }

    /** Function to get the value field {@link DescribeGenerateTweets#input}
     * @return Returns hashtag
     */
    public String getInput() {
        return input;
    }

    /** The function for adjusting the field {@link DescribeGenerateTweets#input}
     * @param input-the value entered by the keyboard (= hashtag)
     */
    public void setInput(String input) {
        this.input = input;
    }

}
