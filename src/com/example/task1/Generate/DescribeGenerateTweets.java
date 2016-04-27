package com.example.task1.Generate;

import com.example.task1.Lines.Sentiments;
import com.example.task1.Lines.Tweets;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *Класс служит для описания 1-ого отчёта
 */
public class DescribeGenerateTweets {

    /** Свойство - хэштег */
    private String input;

    /** Свойство - список твитов,содержащий необходимый хэштег */
    private ArrayList<Tweets>listTweets;

    /** Функция для получения значения поля {@link DescribeGenerateTweets#listTweets}
     * @return Возвращает список твитов
     */
    public ArrayList<Tweets> getListTweets() {
        return listTweets;
    }

    /** Функция для установления значения полю {@link DescribeGenerateTweets#listTweets}
     * @param listTweets-список всех твитов
     */
    public void setListTweets(ArrayList<Tweets> listTweets) {
        this.listTweets = listTweets;
    }

    /** Функция для получения значения поля {@link DescribeGenerateTweets#input}
     * @return Возвращает хэштег
     */
    public String getInput() {
        return input;
    }

    /** Функция для установления значения полю {@link DescribeGenerateTweets#input}
     * @param input-значение,введённое с клавиатуры(=хэштег)
     */
    public void setInput(String input) {
        this.input = input;
    }

}
