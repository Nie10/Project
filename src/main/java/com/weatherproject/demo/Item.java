package com.weatherproject.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {

    private String title;
    private String lat;
    private String longg;
    private String link;
    private String pubDate;
    private Condition condition;
    private List<Forecast> forecast;
    private String description;
    private Guid guid;

    public Item(){
    }

    public String getTitle() {
        return title;
    }

    public String getLat() {
        return lat;
    }

    public String getLongg() {
        return longg;
    }

    public String getLink() {
        return link;
    }

    public String getPubDate() {
        return pubDate;
    }

    public String getDescription() {
        return description;
    }

    public Condition getCondition() {
        return condition;
    }

    public List<Forecast> getForecast() {
        return forecast;
    }

    public Guid getGuid() {
        return guid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public void setLongg(String longg) {
        this.longg = longg;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }

    public void setGuid(Guid guid) {
        this.guid = guid;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", lat='" + lat + '\'' +
                ", longg='" + longg + '\'' +
                ", link='" + link + '\'' +
                ", pubDate='" + pubDate + '\'' +
                ", condition=" + condition +
                ", forecast=" + forecast +
                ", description='" + description + '\'' +
                ", guid=" + guid +
                '}';
    }
}
