package com.coolweather.android.gson;

/**
 * Created by msi on 2017/10/26.
 */

public class Now {
    /**
     * 体感温度
     */
    public String fl;

    /**
     * 相对湿度
     */
    public String hum;

    /**
     * 	降水量
     */
    public String pcpn;

    /**
     *气压
     */
    public String pres;

    /**
     *温度
     */
    public String tmp;

    /**
     *能见度
     */
    public String vis;

    /**
     *风力情况
     */
    public Wind wind;

    /**
     *天气状况
     */
    public Cond cond;

    public class Wind{

        /**
         *风向（360度
         */
        public String deg;

        /**
         *风向
         */
        public String dir;

        /**
         *风力等级
         */
        public String sc;

        /**
         *风速
         */
        public String spd;
    }
    public class Cond{

        /**
         *天气状况代码
         */
        public String code;

        /**
         *数据详情
         */
        public String txt;
    }

}
