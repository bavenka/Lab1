package com.example.task1.Generate;

/**
 * Created by Павел on 06.04.2016.
 */
public interface IGenerateSecond {
    public interface IGenerateFirst<T,V,L,M> {
        public T generate(V time_1,V time_2,L listTweets,M listSentiments);
    }
}
