package com.xt.mian;

import com.xt.service.HelloService;
import com.xt.service.impl.HelloServiceImpl;

import javax.xml.ws.Endpoint;

public class App
{
    public static void main( String[] args )
    {
        HelloService h = new HelloServiceImpl();
        Endpoint.publish("http://localhost:9999/javaws/getWeather",h);
        System.out.println("发布成功");
    }
}
