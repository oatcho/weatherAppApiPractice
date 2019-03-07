package com.detroitlabs.sunnyday.controller;

import com.detroitlabs.sunnyday.model.Forecast;
import com.detroitlabs.sunnyday.model.BasicWeatherData;
import com.detroitlabs.sunnyday.model.SunInfo;
import com.detroitlabs.sunnyday.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @ResponseBody
    @RequestMapping("/")
    public String displayWeather() {
        Forecast forecast = weatherService.fetchWeatherData();
        BasicWeatherData basicWeatherData = forecast.getBasicWeatherData();
        SunInfo sunInfo = forecast.getSunInfo();
        String temperatureString = String.valueOf(basicWeatherData.getTemp());
        String humidityString = String.valueOf(basicWeatherData.getHumidity());
        String sunriseString = String.valueOf(sunInfo.getSunrise());
        String sunsetString = String.valueOf(sunInfo.getSunset());
//        return forecast.getName();
        return humidityString + temperatureString + sunriseString + sunsetString;
    }
}
