package com.weatherproject.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Condition {

    private String code;
    private String date;
    private String temp;
    private String text;

    public Condition(){
    }

    public String getCode() {
        return code;
    }

    public String getDate() {
        return date;
    }

    public String getTemp() {
        return temp;
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

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Condition{" +
                "code='" + code + '\'' +
                ", date='" + date + '\'' +
                ", temp='" + temp + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
