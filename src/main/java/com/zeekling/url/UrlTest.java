package com.zeekling.url;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlTest {

    public static void main(String[] args) throws MalformedURLException {
        URL u1 = new URL("http://www.111.com");
        System.out.println(u1);
        URL u2 = new URL("https://www.baidu.com");
        System.out.println(u2);
    }

}
