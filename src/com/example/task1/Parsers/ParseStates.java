package com.example.task1.Parsers;

import com.example.task1.Lines.States;

import org.json.JSONArray;

public class ParseStates {
   // @Override
    public States parse(JSONArray sent){
        States state=new States();
        for(int i=0;i<sent.length();i++){
            JSONArray groupJson=new JSONArray(sent.get(i).toString());
            for(int j=0;j<groupJson.length();j++){
                JSONArray coordinatesJson=new JSONArray(groupJson.get(j).toString());
                if(sent.length()==1){
                    double latitude=coordinatesJson.getDouble(0);
                    double longitude=coordinatesJson.getDouble(1);
                    state.addCoordinates(i+1,latitude,longitude);
                    continue;
            }
                for(int k=0;k<coordinatesJson.length();k++){
                    JSONArray arrayJson=new JSONArray(coordinatesJson.get(k).toString());
                    if(arrayJson.length()==2){
                        double latitude=arrayJson.getDouble(0);
                        double longitude=arrayJson.getDouble(1);
                        state.addCoordinates(i+1,latitude,longitude);
                    }
                }
            }
        }
        return state;
    }
}
