package com.ocp32_io;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class OpenWeather {
    public static void main(String[] args) throws Exception{
        String id ="be51972aa8897b4c1c4a8c8f94492e3c";
        String cityName = "taoyuan,TW";
        String urlstr = "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s";
        urlstr = String.format(urlstr, cityName, id);
        System.out.println(urlstr);
     
        URL url = new URL(urlstr);
        InputStream is= url.openStream();
        Reader r = new InputStreamReader(is);
        int data = 0;
        String jsonStr = "";
        while ( (data = r.read()) != -1) {            
            jsonStr += (char)data;
        }
        System.out.println(jsonStr);
        }
}
