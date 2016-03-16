package com.example.task1.Parsers;

/**
 * Created by Павел on 15.03.2016.
 */
public interface IParse<T,V> {
    public T parse(V sent);
}
