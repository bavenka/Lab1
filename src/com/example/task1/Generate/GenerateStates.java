package com.example.task1.Generate;

import com.example.task1.Lines.States;
import com.example.task1.Lines.Tweets;
import org.javatuples.Triplet;

import java.util.*;
import java.util.concurrent.SynchronousQueue;
import java.util.stream.Collectors;

/**
 Класс служит для реализации интерфейса
 * @see IGenerate
 */
public class GenerateStates implements IGenerate<String,DescribeGenerateStates> {
    @Override

    /**
     * Реализация 2-ого отчёта
     * @see IGenerate#generate(Object)
     */
    public  String generate(DescribeGenerateStates obj) {
        ArrayList<Tweets> listTweets = new ArrayList();
        HashMap<String,Integer> states=new HashMap();
        int count=0;
        for (Tweets t : obj.getListTweets()) {
            if (t.getDate().after(obj.getStart()) && t.getDate().before(obj.getFinish())) {
                listTweets.add(t);
            }
        }

        for (States state : obj.getListStates()) {
            int nElements=state.getCoordinatesList().size();
            ArrayList<Triplet<Integer,Double,Double>> listCoordinates = state.getCoordinatesList();
            ArrayList<Double> xStates=new ArrayList();
            ArrayList<Double> yStates=new ArrayList();
            for (Tweets tweet : listTweets) {
                Double y=tweet.getLatitude();
                Double x=tweet.getLongitude();
                for(Triplet<Integer,Double,Double> object: listCoordinates){

                    xStates.add(object.getValue1());
                    yStates.add(object.getValue2());

                }
                if(obj.pnpoly(nElements,xStates,yStates,x,y)==true) {
                    count++;

                }
            }
            states.put(state.getName(), count);
            count=0;
        }
        return obj.SortMap(states);
    }
}

