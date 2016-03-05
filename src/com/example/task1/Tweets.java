package com.example.task1;

import java.util.Date;

public class Tweets {
    private Double latitude;
    private Double longitude;
    private Date date;
    private String text;

    public Tweets(){

    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", date=" + date +
                ", text='" + text + '\'';
    }
}

