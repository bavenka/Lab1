package com.example.task1.Generate;

/**
 * Created by Павел on 16.04.2016.
 */
public interface IGenerateThird {
    public interface IGenerateFirst<T,V,L,M> {
        public T generate(V listTweets,L listStates,M time_1,M time_2);
    }
}
