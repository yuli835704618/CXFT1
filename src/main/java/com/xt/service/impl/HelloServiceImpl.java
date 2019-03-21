package com.xt.service.impl;

import com.xt.service.HelloService;

import javax.jws.WebService;

@WebService
public class HelloServiceImpl implements HelloService {
    public String getWeather(){
        return "天气";
    }
}
