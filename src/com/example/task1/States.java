package com.example.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.example.task1.Readers.Read;
import org.javatuples.*;

public class States {
    private String name;
    private ArrayList<Triplet<Integer,Double,Double>> coordinatesList;

    public States(){
        this.coordinatesList=new ArrayList<Triplet<Integer, Double, Double>>();
    }

    public void addCoordinates(int group,double latitude,double longitude){
        coordinatesList.add(new Triplet<Integer,Double,Double>(group,latitude,longitude));
    }

    public ArrayList<Triplet<Integer, Double, Double>> getCoordinatesList() {
        return coordinatesList;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", coordinatesList=" + coordinatesList;
    }
}


