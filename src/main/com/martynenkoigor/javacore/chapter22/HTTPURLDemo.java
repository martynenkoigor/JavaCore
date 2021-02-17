package com.martynenkoigor.javacore.chapter22;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HTTPURLDemo {
    public static void main(String[] args) throws Exception {
        URL hp = new URL("http://www.google.com");

        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();

        System.out.println("Meтoд запроса: " + hpCon.getRequestMethod());

        System.out.println("Koд ответа: " + hpCon.getResponseCode());

        System.out.println("Oтвeтнoe сообщение: " + hpCon.getResponseMessage());



    }
}
