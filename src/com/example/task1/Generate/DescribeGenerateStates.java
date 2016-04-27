package com.example.task1.Generate;

import com.example.task1.Lines.States;
import com.example.task1.Lines.Tweets;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Класс служит для описания 3-его лтчёта
 */
public class DescribeGenerateStates {

    /** Свойство - список твитов,входяших в заданный промежуток времени */
    private ArrayList<Tweets> listTweets;

    /** Свойство - список всех штатов */
    private ArrayList<States>listStates;

    /** Свойство - начало времени отсчёта */
    private Date start;

    /** Свойство - конец времени отсчёта */
    private Date finish;

    /** Функция для проверки на пренадлежность опубликованного твита штату
     * @param npol-количество координат штата
     * @param xp-список вещественных значений штата,отвечающих за широту
     * @param yp-список вещественных значений штата,отвечающих за долготу
     * @param x-вещественное значение широты твита
     * @param y -вещественное значение долготы твита
     * @return Возвращает ключевое слово true,если опубликованный твит пренадлежит данному штату,
     * в противном случае-false
     */
    public Boolean pnpoly(int npol, ArrayList<Double> xp, ArrayList<Double> yp, Double x, Double y) {
        Boolean c = false;
        for (int i = 0, j = npol - 1; i < npol; j = i++) {
            if ((((yp.get(i) <= y) && (y < yp.get(j))) || ((yp.get(j) <= y) && (y < yp.get(i)))) &&
                    (x > (xp.get(j) - xp.get(i)) * (y - yp.get(i)) / (yp.get(j) - yp.get(i)) + xp.get(i)))
                c = !c;

        }
        return c;
    }

    /** Функция для сортировки коллекции штатов по возрастанию значения количества твитов,
     * опубликованных из данного шата и определения названия штата,из котого было
     * отправлено наибольшее количества твитов в заданный промежуток времени путём
     * выбора последнего элемента уже отсортированной коллекции
     * @param map-коллекция штатов
     * @return Возвращает значение названия штата,из которого было отправлено наибольшее
     * количество твитов в заданнный промежуток времени
     */
    public String SortMap(HashMap<String,Integer> map){
        map= map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        List<Map.Entry<String,Integer>> entryList=new ArrayList(map.entrySet());

        return entryList.get(entryList.size()-1).getKey();
    }

    /** Функция для получения значения поля {@link DescribeGenerateStates#listStates}
     * @return Возвращает список штатов,входяший в заданный промежуток времени
     */
    public ArrayList<States> getListStates() {
        return listStates;
    }

    /** Функция для установления значения полю {@link DescribeGenerateStates#listStates}
     * @param listStates-список всех штатов
     */
    public void setListStates(ArrayList<States> listStates) {
        this.listStates = listStates;
    }

    /** Функция для получения значения поля {@link DescribeGenerateStates#start}
     * @return Возвращает значение начала отсчёта времени
     */
    public Date getStart() {
        return start;
    }

    /** Функция для установления значения полю {@link DescribeGenerateStates#start}
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

    /** Функция для установления значения полю {@link DescribeGenerateStates#listTweets}
     * @param listTweets-список всех твитов
     */
    public void setListTweets(ArrayList<Tweets> listTweets) {
        this.listTweets = listTweets;
    }

    /** Функция для получения значения поля {@link DescribeGenerateStates#finish}
     * @return Возвращает значение конца отсчёта времени
     */
    public Date getFinish() {
        return finish;
    }

    /** Функция для установления значения полю {@link DescribeGenerateStates#finish}
     * @param finish-значение,введённое с клавиатуры(=конец отсчёта времени)
     */
    public void setFinish(Date finish) {
        this.finish = finish;
    }
}
