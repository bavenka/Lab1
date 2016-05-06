package com.example.task1.Generate;

import com.example.task1.Lines.Sentiments;
import com.example.task1.Lines.Tweets;

import java.util.ArrayList;
import java.util.Date;

/**
 * The class used to describe the second report
 */
public class DescribeGenerateSentiments {

    /** The property - a list of tweets, within the specified period of time */
    private ArrayList<Tweets>listTweets;

    /** The property - a list of all emotions */
    private ArrayList<Sentiments>listSentiments;

    /** Soul - the beginning of the time of reference */
    private Date start;

    /** Property - the end of the time reference */
    private Date finish;

    /** Function to get the value field {@link DescribeGenerateSentiments#listSentiments}
     * @return It returns a list of all the emotions
     */
    public ArrayList<Sentiments> getListSentiments() {
        return listSentiments;
    }

    /** The function for adjusting the field {@link DescribeGenerateSentiments#listSentiments}
     * @param listSentiments-a list of all emotions
     */
    public void setListSentiments(ArrayList<Sentiments> listSentiments) {
        this.listSentiments = listSentiments;
    }

    /** Function to get the value field {@link DescribeGenerateSentiments#start}
     * @return Returns the beginning of the reference time
     */
    public Date getStart() {
        return start;
    }

    /** The function for adjusting the field {@link DescribeGenerateSentiments#start}
     * @param start-the value entered with the keyboard
     */
    public void setStart(Date start) {
        this.start = start;
    }

    /** Function to get the value field {@link DescribeGenerateSentiments#listTweets}
     * @return Returns a list of tweets, within the specified period of time
     */
    public ArrayList<Tweets> getListTweets() {
        return listTweets;
    }

    /** The function for adjusting the field {@link DescribeGenerateSentiments#listTweets}
     * @param listTweets-a list of all tweets
     */
    public void setListTweets(ArrayList<Tweets> listTweets) {
        this.listTweets = listTweets;
    }

    /** Function to get the value field {@link DescribeGenerateSentiments#finish}
     * @return Returns the value of the end of the reference time
     */
    public Date getFinish() {
        return finish;
    }

    /** The function for adjusting the field {@link DescribeGenerateSentiments#finish}
     * @param finish-the value entered with the keyboard
     */
    public void setFinish(Date finish) {
        this.finish = finish;
    }
}
