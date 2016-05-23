package com.example.task1.Generate;

import com.example.task1.Lines.States;
import com.example.task1.Lines.Tweets;

import java.util.*;
import java.util.stream.Collectors;

/**
 * The class is used to describe the 3rd report
 */
public class DescribeGenerateStates {

    /** The property - a list of tweets, within the specified period of time */
    private ArrayList<Tweets> listTweets;

    /** The property - a list of all the states */
    private ArrayList<States>listStates;

    /** Soul - the beginning of the time of reference */
    private Date start;

    /** Property - the end of the time reference */
    private Date finish;

    /** The function to check on the state of affiliation published tweets
     * @param npol-the number of state origin
     * @param xp-List of real state values corresponding to the breadth of the
     * @param yp-List of real state values, responsible for longitude
     * @param x-real value tweet latitude
     * @param y -real value longitude Tweets
     * @return Returns the keyword true, if published tweet belongs to this state, otherwise-false
     */
    public Boolean pnpoly(int npol, ArrayList<Double> xp, ArrayList<Double> yp, Double x, Double y) {
        Boolean c = false;
        for (int i = 0, j = npol - 1; i < npol; j = i++) {
            if ((((yp.get(i) <= y) && (y < yp.get(j))) || ((yp.get(j) <= y) && (y < yp.get(i)))) &&
                    (x > (xp.get(j) - xp.get(i)) * (y - yp.get(i)) / (yp.get(j) - yp.get(i)) + xp.get(i)))
                c = !c;

        }
        return c;
    }

    /** Function to sort a collection of states in increasing the value amount of tweets,
       * published from this sata and for the name of the state, from which you'll have been
       * sent the largest number of tweets at a given time interval by
       * select the last element is already sorted collection
     * @param map-state collection
     * @return Returns the name of the state from which it was sent to the highest
         *  number of tweets per zadannny period of time
     */
    public String SortMap(HashMap<String,Integer> map){
        map= map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        List<Map.Entry<String,Integer>> entryList=new ArrayList(map.entrySet());

        return entryList.get(entryList.size()-1).getKey();
    }

    /** Function to get the value field {@link DescribeGenerateStates#listStates}
     * @return Returns a list of the states included in the specified period of time
     */
    public ArrayList<States> getListStates() {
        return listStates;
    }

    /** The function for adjusting the field {@link DescribeGenerateStates#listStates}
     * @param listStates-a list of all the states
     */
    public void setListStates(ArrayList<States> listStates) {
        this.listStates = listStates;
    }

    /** Function to get the value field {@link DescribeGenerateStates#start}
     * @return Returns the beginning of the reference time
     */
    public Date getStart() {
        return start;
    }

    /** The function for adjusting the field {@link DescribeGenerateStates#start}
     * @param start-the value entered by the keyboard (= reference point of time)
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

    /** The function for adjusting the field {@link DescribeGenerateStates#listTweets}
     * @param listTweets-a list of all tweets
     */
    public void setListTweets(ArrayList<Tweets> listTweets) {
        this.listTweets = listTweets;
    }

    /** Function to get the value field {@link DescribeGenerateStates#finish}
     * @return Returns the value of the end of the reference time
     */
    public Date getFinish() {
        return finish;
    }

    /** The function for adjusting the field {@link DescribeGenerateStates#finish}
     * @param finish-the value entered by the keyboard (= end of the reference time)
     */
    public void setFinish(Date finish) {
        this.finish = finish;
    }
}
