package com.example.task1.Generate;
import com.example.task1.Lines.Tweets;

import java.util.ArrayList;

/**
 * Class is used to implement the interface
 * @see IGenerate
 */

public class GenerateTweets implements IGenerate<ArrayList<Tweets>,DescribeGenerateTweets> {
    @Override

    /**
     * Implementation of the first report
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
