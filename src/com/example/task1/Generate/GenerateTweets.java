package com.example.task1.Generate;
import com.example.task1.Lines.Tweets;

import java.util.ArrayList;

/**
 * Класс служит для реализации интерфейса
 * @see IGenerate
 */

public class GenerateTweets implements IGenerate<ArrayList<Tweets>,DescribeGenerateTweets> {
    @Override

    /**
     * Реализация 1-ого отчёта
     * @see IGenerate#generate(Object)
     */
    public ArrayList<Tweets> generate(DescribeGenerateTweets obj){
        ArrayList<Tweets> listTweets=new ArrayList();
       for(Tweets t:obj.getListTweets()){
           if(t.toString().contains(obj.getInput())){
               listTweets.add(t);
           }
       }
        return listTweets;
    }
}
