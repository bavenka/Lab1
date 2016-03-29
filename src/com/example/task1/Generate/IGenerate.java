package com.example.task1.Generate;

/**
 * Created by Павел on 23.03.2016.
 */
public interface IGenerate<T,V,M,L> {
    public T generate(V input,M listTweets,L listSentiments);
}
