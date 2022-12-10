package com.lucaspetrocini.watherview.model;

import java.util.Date;

public class Location {

    private String name;
    private String region;
    private String country;
    private double lat;
    private double lon;
    private String timezone;
    private Date localTime;

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public String getTimezone() {
        return timezone;
    }

    public Date getLocalTime() {
        return localTime;
    }
}
