package com.weatherproject.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Query {

    private int count;
    private String created;
    private String lang;
    private Results results;

    public Query(){
    }

    public int getCount() {
        return count;
    }

    public String getCreated() {
        return created;
    }

    public String getLang() {
        return lang;
    }

    public Results getResults() {
        return results;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setResults(Results results) {
        this.results = results;
    }


    @Override
    public String toString() {
        return "Query{" +
                "count=" + count +
                ", created='" + created + '\'' +
                ", lang='" + lang + '\'' +
                ", results=" + results +
                '}';
    }

}

