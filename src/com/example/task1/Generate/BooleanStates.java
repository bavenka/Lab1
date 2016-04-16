package com.example.task1.Generate;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Павел on 15.04.2016.
 */
public class BooleanStates {
    public static Boolean pnpoly(int npol, ArrayList<Double> xp, ArrayList<Double> yp, Double x, Double y) {
        Boolean c = false;
        for (int i = 0, j = npol - 1; i < npol; j = i++) {
            if ((((yp.get(i) <= y) && (y < yp.get(j))) || ((yp.get(j) <= y) && (y < yp.get(i)))) &&
                    (x > (xp.get(j) - xp.get(i)) * (y - yp.get(i)) / (yp.get(j) - yp.get(i)) + xp.get(i)))
                c = !c;

        }
        return c;
    }
   public static String SortMap(HashMap<String,Integer> map){
       map= map.entrySet().stream()
               .sorted(Map.Entry.comparingByValue())
               .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                       (e1, e2) -> e1, LinkedHashMap::new));
       List<Map.Entry<String,Integer>> entryList=new ArrayList(map.entrySet());

       return entryList.get(entryList.size()-1).getKey();
   }
}
