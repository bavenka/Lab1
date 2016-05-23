package com.example.task1;


import com.example.task1.DataBase.AddInfo;
import com.example.task1.DataBase.ConnectDB;
import com.example.task1.DataBase.GetInfo;
import com.example.task1.Lines.Sentiments;
import com.example.task1.Lines.States;
import com.example.task1.Lines.Tweets;
import com.example.task1.Readers.Describe;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//          1-ый отчёт
//        DescribeGenerateTweets obj=new DescribeGenerateTweets();
//        System.out.println("Шаблон:#...");
        Scanner in=new Scanner(System.in);
        String hashtag=in.nextLine();
//        obj.setInput(hashtag);
//        obj.setListTweets(Describe.getTweets());
//        IGenerate<ArrayList<Tweets>,DescribeGenerateTweets> test=new GenerateTweets();
//        System.out.println(test.generate(obj));
//        ################################################################################
//          2-ой отчёт
//        DescribeGenerateSentiments obj=new DescribeGenerateSentiments();
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        BufferedReader br=null;
//        Date date1=null;
//        Date date2=null;
//        try {
//            br = new BufferedReader(new InputStreamReader(System.in));
//            date1 = formatter.parse(br.readLine());
//            date2 = formatter.parse(br.readLine());
//            br.close();
//        }catch (IOException e){
//            e.fillInStackTrace();
//        }catch (ParseException e) {
//            e.fillInStackTrace();
//        }
//        obj.setStart(date1);
//        obj.setFinish(date2);
//        obj.setListTweets(Describe.getTweets());
//        obj.setListSentiments(Describe.getSentiments());
//        obj.setListTweets(Describe.getTweets());
//        IGenerate<Double,DescribeGenerateSentiments> test=new GenerateSentiments();
//        System.out.println(test.generate(obj));
//          ######################################################################
//        3-ий отчёт
//        DescribeGenerateStates obj=new DescribeGenerateStates();
//        obj.setStart(date1);
//        obj.setFinish(date2);
//        obj.setListTweets(Describe.getTweets());
//        obj.setListStates(Describe.getStates());
//        IGenerate<String,DescribeGenerateStates> test=new GenerateStates();
//        System.out.println(test.generate(obj));
//        MapStates obj=new MapStates();
//        obj.showFrame();
        //x-лаба
        try{
            Connection connection= ConnectDB.getDBConnection();
            ArrayList<Tweets> allTweets=Describe.getTweets();
            ArrayList<Sentiments>allSentiments=Describe.getSentiments();
            ArrayList<States>allStates=Describe.getStates();
            //for(Tweets tweet:allTweets)
               // AddInfo.addTweets(connection,tweet);
           // for(Sentiments sentiment:allSentiments)
              //  AddInfo.addSentiments(connection,sentiment);
           // for(States state:allStates){
              // AddInfo.addStates(connection,state);
           // }
       // GetInfo.getTweets(connection);
       //  GetInfo.getSentiments(connection);

                GetInfo.doReport(connection,hashtag);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
