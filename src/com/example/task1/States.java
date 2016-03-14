package com.example.task1;

import java.util.ArrayList;

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


