package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by msi on 2017/10/26.
 */

public class Basic {
    /* 城市名称 */
    @SerializedName("city")
    public String cityName;

    /**
     * 城市id
     */
    @SerializedName("id")
    public String weatherId;

    /**
     * 国家
     */
    public String cnty;

    /**
     * 维度
     */
    public String lat;

    /**
     * 经度
     */
    public String lon;

    /**
     * 更新时间
     */
    public Update update;

    public class Update{
        /**
         * 当地时间
         */
        public String loc;

        /**
         * UTC时间
         */
        public String utc;
    }
}
