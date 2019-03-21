package com.xt.mian;

import com.xt.wearther.ArrayOfString;
import com.xt.wearther.WeatherWS;
import com.xt.wearther.WeatherWSSoap;

import java.util.List;

public class App01 {
    public static void main(String[] args) {
        WeatherWSSoap weatherWSSoap = new WeatherWS().getWeatherWSSoap();
        ArrayOfString as = weatherWSSoap.getWeather("崇阳",null);
        List<String> list = as.getString();
        for(String str:list){
            System.out.println(str);
        }


    }
}
