package com.detroitlabs.sunnyday.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {

    private String name;
    private BasicWeatherData basicWeatherData;
    private SunInfo sunInfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("main")
    public BasicWeatherData getBasicWeatherData() {
        return basicWeatherData;
    }

    @JsonProperty("main")
    public void setBasicWeatherData(BasicWeatherData temperature) {
        this.basicWeatherData = temperature;
    }

    @JsonProperty("sys")
    public SunInfo getSunInfo() {
        return sunInfo;
    }

    @JsonProperty("sys")
    public void setSunInfo(SunInfo sunInfo) {
        this.sunInfo = sunInfo;
    }

}
