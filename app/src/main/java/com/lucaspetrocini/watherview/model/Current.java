package com.lucaspetrocini.watherview.model;

import java.util.Date;

public class Current {

    private Date lastUpdated;
    private double tempCelsius;
    private double tempFahrenheit;
    private int isDay;
    private Condition condition;
    private double humidity;
    private double uv;

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public double getTempCelsius() {
        return tempCelsius;
    }

    public double getTempFahrenheit() {
        return tempFahrenheit;
    }

    public int getIsDay() {
        return isDay;
    }

    public Condition getCondition() {
        return condition;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getUv() {
        return uv;
    }
}
