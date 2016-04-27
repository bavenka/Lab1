package com.example.task1;


import com.example.task1.MapStates.MapStates;

public class Main {

    public static void main(String[] args) {
//          1-ый отчёт
//        DescribeGenerateTweets obj=new DescribeGenerateTweets();
//        System.out.println("Шаблон:#...");
//        Scanner in=new Scanner(System.in);
//        String hashtag=in.nextLine();
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
        MapStates obj=new MapStates();
        obj.showFrame();
    }
}
