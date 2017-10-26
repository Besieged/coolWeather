package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by msi on 2017/10/26.
 */

public class Weather {

    public String status;

    public AQI aqi;

    public Basic basic;

    public Suggestion suggestion;

    public Now now;

    @SerializedName("daily_forecast")
    public List<DailyForecast> dailyForecastList;

    @SerializedName("hourly_forecast")
    public List<HourlyForecast> hourlyForecastList;

}
