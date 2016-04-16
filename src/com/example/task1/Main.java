package com.example.task1;


import com.example.task1.Generate.GenerateSentiments;
import com.example.task1.Generate.GenerateStates;
import com.example.task1.Generate.IGenerateSecond;
import com.example.task1.Generate.IGenerateThird;
import com.example.task1.Lines.Sentiments;
import com.example.task1.Lines.States;
import com.example.task1.Lines.Tweets;
import com.example.task1.Readers.Describe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args) {
        ArrayList<Tweets> tweets= Describe.getTweets();
        ArrayList<Sentiments>allSentiments=Describe.getSentiments();
        ArrayList<States> allStates=Describe.getStates();
        BufferedReader br=null;
        //1-ый отчёт
//        System.out.println("Шаблон:#...");
      Scanner in=new Scanner(System.in);
//        String hashtag=in.nextLine();
//        IGenerateFirst<ArrayList<Tweets>,String> obj=new GenerateTweets();
//        System.out.println(obj.generate(tweets,hashtag));
        //System.out.println("Шаблон:HH:mm:ss");
//2-ой отчёт
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1=null;
        Date date2=null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            date1 = formatter.parse(br.readLine());
            date2 = formatter.parse(br.readLine());
            br.close();
        }catch (IOException e){
            e.fillInStackTrace();
        }catch (ParseException e) {
            e.fillInStackTrace();
        }
//        IGenerateSecond.IGenerateFirst<Double,Date,ArrayList<Tweets>,ArrayList<Sentiments>> obj2=new GenerateSentiments();
//        System.out.println(obj2.generate(date1,date2,tweets,allSentiments));
        //3-ий отчёт
        IGenerateThird.IGenerateFirst<String,ArrayList<Tweets>,ArrayList<States>,Date> obj=new GenerateStates();
        System.out.println(obj.generate(tweets,allStates,date1,date2));
    }
}
