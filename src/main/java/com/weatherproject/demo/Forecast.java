package com.weatherproject.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Collection;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {

    private String code;
    private String date;
    private String day;
    private String high;
    private String low;
    private String text;

    public Forecast(){
    }

    public String getCode() {
        return code;
    }

    public String getDate() {
        return date;
    }

    public String getDay() {
        return day;
    }

    public String getHigh() {
        return high;
    }

    public String getLow() {
        return low;
    }

    public String getText() {
        return text;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "code='" + code + '\'' +
                ", date='" + date + '\'' +
                ", day='" + day + '\'' +
                ", high='" + high + '\'' +
                ", low='" + low + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
