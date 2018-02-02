package com.weatherproject.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Atmosphere {

    private String humidity;
    private String pressure;
    private String rising;
    private String visibility;

    public Atmosphere(){
    }

    public String getHumidity() {
        return humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public String getRising() {
        return rising;
    }

    public String getVisibility() { return visibility; }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setRising(String rising) {
        this.rising = rising;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @Override
    public String toString() {
        return "Atmosphere{" +
                "humidity='" + humidity + '\'' +
                ", pressure='" + pressure + '\'' +
                ", rising='" + rising + '\'' +
                ", visibility='" + visibility + '\'' +
                '}';
    }
}
