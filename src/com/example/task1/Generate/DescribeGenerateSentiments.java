package com.example.task1.Generate;

import com.example.task1.Lines.Sentiments;
import com.example.task1.Lines.Tweets;

import java.util.ArrayList;
import java.util.Date;

/**
 * Класс служит для описания 2-ого отчёта
 */
public class DescribeGenerateSentiments {

    /** Свойство - список твитов,входяших в заданный промежуток времени */
    private ArrayList<Tweets>listTweets;

    /** Свойство - список всех эмоций */
    private ArrayList<Sentiments>listSentiments;

    /** Свойство - начало времени отсчёта */
    private Date start;

    /** Свойство - конец времени отсчёта */
    private Date finish;

    /** Функция для получения значения поля {@link DescribeGenerateSentiments#listSentiments}
     * @return Возвращает список всех эмоций
     */
    public ArrayList<Sentiments> getListSentiments() {
        return listSentiments;
    }

    /** Функция для установления значения полю {@link DescribeGenerateSentiments#listSentiments}
     * @param listSentiments-список всех эмоций
     */
    public void setListSentiments(ArrayList<Sentiments> listSentiments) {
        this.listSentiments = listSentiments;
    }

    /** Функция для получения значения поля {@link DescribeGenerateSentiments#start}
     * @return Возвращает значение начала отсчёта времени
     */
    public Date getStart() {
        return start;
    }

    /** Функция для установления значения полю {@link DescribeGenerateSentiments#start}
     * @param start-значение,введённое с клавиатуры(=начало отсчёта времени)
     */
    public void setStart(Date start) {
        this.start = start;
    }

    /** Функция для получения значения поля {@link DescribeGenerateSentiments#listTweets}
     * @return Возвращает список твитов,входящих в заданный промежуток времени
     */
    public ArrayList<Tweets> getListTweets() {
        return listTweets;
    }

    /** Функция для установления значения полю {@link DescribeGenerateSentiments#listTweets}
     * @param listTweets-список всех твитов
     */
    public void setListTweets(ArrayList<Tweets> listTweets) {
        this.listTweets = listTweets;
    }

    /** Функция для получения значения поля {@link DescribeGenerateSentiments#finish}
     * @return Возвращает значение конца отсчёта времени
     */
    public Date getFinish() {
        return finish;
    }

    /** Функция для установления значения полю {@link DescribeGenerateSentiments#finish}
     * @param finish-значение,введённое с клавиатуры(=конец отсчёта времени)
     */
    public void setFinish(Date finish) {
        this.finish = finish;
    }
}
