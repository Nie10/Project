package com.weatherproject.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Collection;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Channel {

    private String title;
    private Units units;
    private String link;
    private String description;
    private String language;
    private String lastBuildDate;
    private String ttl;
    private Location location;
    private Wind wind;
    private Atmosphere atmosphere;
    private Astronomy astronomy;
    private Image image;
    private Item item;

    public Channel(){
    }

    public String getTitle() {
        return title;
    }

    public Units getUnits() {
        return units;
    }

    public String getLink() {
        return link;
    }

    public String getDescription() {
        return description;
    }

    public String getLanguage() {
        return language;
    }

    public String getLastBuildDate() {
        return lastBuildDate;
    }

    public String getTtl() {
        return ttl;
    }

    public Location getLocation() {
        return location;
    }

    public Wind getWind() {
        return wind;
    }

    public Atmosphere getAtmosphere() {
        return atmosphere;
    }

    public Astronomy getAstronomy() {
        return astronomy;
    }

    public Image getImage() {
        return image;
    }

    public Item getItem() {
        return item;
    }



    public void setTitle(String title) {
        this.title = title;
    }

    public void setUnits(Units units) {
        this.units = units;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setLastBuildDate(String lastBuildDate) {
        this.lastBuildDate = lastBuildDate;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public void setAtmosphere(Atmosphere atmosphere) {
        this.atmosphere = atmosphere;
    }

    public void setAstronomy(Astronomy astronomy) {
        this.astronomy = astronomy;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setItem(Item item) {
        this.item = item;
    }



    @Override
    public String toString() {
        return "Channel{" +
                "title='" + title + '\'' +
                ", units=" + units +
                ", link='" + link + '\'' +
                ", description='" + description + '\'' +
                ", language='" + language + '\'' +
                ", lastBuildDate='" + lastBuildDate + '\'' +
                ", ttl='" + ttl + '\'' +
                ", location=" + location +
                ", wind=" + wind +
                ", atmosphere=" + atmosphere +
                ", astronomy=" + astronomy +
                ", image=" + image +
                ", item=" + item +
                '}';
    }
}
