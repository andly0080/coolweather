package com.example.davidyu.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by davidyu on 1/10/17.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;


    @SerializedName("id")
    public String weatherId;


    public Update update;


    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }


}
