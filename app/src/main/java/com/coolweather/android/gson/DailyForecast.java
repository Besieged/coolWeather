package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by msi on 2017/10/26.
 */

public class DailyForecast {

    /**
     *日期
     */
    public String date;
    /**
     *相对湿度
     */
    public String hum;
    /**
     *降水量
     */
    public String pcpn;
    /**
     *降水概率
     */
    public String pop;
    /**
     *气压
     */
    public String pres;
    /**
     *紫外线指数
     */
    public String uv;
    /**
     *能见度
     */
    public String vis;
    /**
     *天文指数
     */
    public Astro astro;
    /**
     *温度
     */
    public Tmp tmp;
    /**
     *天气状况
     */
    public Cond cond;
    /**
     *	风力情况
     */
    public Wind wind;

    public class Astro{
        /**
         *月升时间
         */
        public String mr;
        /**
         *月落时间
         */
        public String ms;
        /**
         *日出时间
         */
        public String sr;
        /**
         *日落时间
         */
        public String ss;

    }
    public class Tmp{
        /**
         *最高温度
         */
        public String max;
        /**
         *最低温度
         */
        public String min;
    }
    public class Cond{
        /**
         *白天天气状况代码
         */
        @SerializedName("code_d")
        public String codeD;
        /**
         *夜间天气状况代码
         */
        @SerializedName("code_n")
        public String codeN;
        /**
         *白天天气状况描述
         */
        @SerializedName("txt_d")
        public String txtD;
        /**
         *夜间天气状况描述
         */
        @SerializedName("txt_n")
        public String txtN;
    }
    public class Wind{
        /**
         *风向（360度）
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



}
