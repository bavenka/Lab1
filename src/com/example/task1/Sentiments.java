package com.example.task1;

public class Sentiments {
    private String word;
    private Double digit;

    public Sentiments(){

    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setDigit(Double digit) {
        this.digit = digit;
    }

    @Override
    public String toString() {
        return
                 word+
                "," +digit;
    }
}
