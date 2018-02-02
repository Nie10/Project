package com.weatherproject.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Units {

    private String distance;
    private String pressure;
    private String speed;
    private String temp;

    public Units() {
    }

    public String getDistance() {
        return distance;
    }

    public String getPressure() {
        return pressure;
    }

    public String getSpeed() {
        return speed;
    }

    public String getTemp() {
        return temp;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Units{" +
                "distance='" + distance + '\'' +
                ", pressure='" + pressure + '\'' +
                ", speed='" + speed + '\'' +
                ", temp='" + temp + '\'' +
                '}';
    }
}

