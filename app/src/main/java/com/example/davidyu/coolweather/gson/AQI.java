package com.example.davidyu.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by davidyu on 1/10/17.
 */

public class AQI {

     public  AQICity city;


    public class AQICity{

        public String aqi;

        public String pm25;

    }

}
