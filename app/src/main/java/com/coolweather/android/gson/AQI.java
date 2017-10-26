package com.coolweather.android.gson;

/**
 * Created by msi on 2017/10/26.
 */

public class AQI {

    /**
     * 城市
     */
    public City city;

    public class City{
        /**
         * AQI
         */
        public String aqi;

        /**
         * PM10
         */
        public String pm10;

        /**
         * PM2.5
         */
        public String pm25;

        /**
         * 空气质量
         */
        public String qlty;
    }
}
