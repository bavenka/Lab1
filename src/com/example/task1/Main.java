package com.example.task1;


import com.example.task1.Generate.GenerateSentiments;
import com.example.task1.Generate.GenerateTweets;
import com.example.task1.Generate.IGenerate;
import com.example.task1.Readers.Describe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Шаблон:#...");

       Scanner in=new Scanner(System.in);
//        String hashtag=in.nextLine();
        ArrayList<Tweets> tweets= Describe.getTweets();
        ArrayList<Sentiments>allSentiments=Describe.getSentiments();
        System.out.println("Шаблон:HH:mm:ss");
        String time=in.nextLine();
        IGenerate<Double,String,ArrayList<Tweets>,ArrayList<Sentiments>> obj=new GenerateSentiments();
        System.out.println(obj.generate(time,tweets,allSentiments));
   }
}
