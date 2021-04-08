package com.zeekling.string;


public class StringBuilderTest   {

    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer(10);
        s1.append("1234");
        System.out.println(s1.length());
        System.out.println(s1.capacity());
    }
    
}
