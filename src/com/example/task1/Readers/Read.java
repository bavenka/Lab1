package com.example.task1.Readers;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Read {
    public static ArrayList<String> readStrings(String path, int start, int number) {
        ArrayList<String> lines = new ArrayList<String>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            int counter = 0;
            while ((line = reader.readLine()) != null) {
                counter++;
                if (counter < start) {
                    continue;
                } else if (counter >= start && counter < start + number) {

                    lines.add(line);
                } else break;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return lines;
    }

    public static String readAll(String path) {
        String s=" ";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null){
                s+=line;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return s;
    }
}
