package com.example.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {
    public static void read(String path,int start,int number)
    {
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line;
            int counter=0;
            while((line=reader.readLine())!=null){
                counter++;
                if(counter<start) {
                    continue;
                }
                else if(counter>=start && counter<start+number) {
                    System.out.println(line);
                }
                else break;
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
