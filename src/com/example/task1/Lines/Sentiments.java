package com.example.task1.Lines;

public class Sentiments {
    private String word;
    private Double digit;

    public Sentiments(){

    }

    public Sentiments(String word, Double digit) {
        this.word = word;
        this.digit = digit;
    }

    public String getWord() {
        return word;
    }

    public Double getDigit() {
        return digit;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setDigit(Double digit) {
        this.digit = digit;
    }

    @Override
    public String toString() {
        return "Sentiments{" +
                "word='" + word + '\'' +
                ", digit=" + digit +
                '}';
    }
}
