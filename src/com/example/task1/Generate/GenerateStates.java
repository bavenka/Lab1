package com.example.task1.Generate;

import com.example.task1.Lines.States;
import com.example.task1.Lines.Tweets;
import org.javatuples.Triplet;

import java.util.*;
import java.util.concurrent.SynchronousQueue;
import java.util.stream.Collectors;

/**
 * Created by Павел on 15.04.2016.
 */
public class GenerateStates implements IGenerateThird.IGenerateFirst<String,ArrayList<Tweets>,ArrayList<States>,Date> {
    @Override
    public  String generate(ArrayList<Tweets> allTweets, ArrayList<States> allStates, Date time_1, Date time_2) {
        ArrayList<Tweets> listTweets = new ArrayList();
        HashMap<String,Integer> states=new HashMap();
        int count=0;
        for (Tweets t : allTweets) {
            if (t.getDate().after(time_1) && t.getDate().before(time_2)) {
                listTweets.add(t);
            }
        }

        for (States state : allStates) {
            int nElements=state.getCoordinatesList().size();
            ArrayList<Triplet<Integer,Double,Double>> listCoordinates = state.getCoordinatesList();
            ArrayList<Double> xStates=new ArrayList();
            ArrayList<Double> yStates=new ArrayList();
            for (Tweets tweet : listTweets) {
                Double y=tweet.getLatitude();
                Double x=tweet.getLongitude();
                for(Triplet<Integer,Double,Double> obj: listCoordinates){

                    xStates.add(obj.getValue1());
                    yStates.add(obj.getValue2());

                }
                if(BooleanStates.pnpoly(nElements,xStates,yStates,x,y)==true) {
                    count++;

                }
            }
            states.put(state.getName(), count);
            count=0;
            String word=BooleanStates.SortMap(states);
        }
        return BooleanStates.SortMap(states);
    }
}

