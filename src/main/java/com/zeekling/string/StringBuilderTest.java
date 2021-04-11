package com.zeekling.string;


public class StringBuilderTest   {


    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer(10);
        double x=2.0; 
        int y=4; x/=++y; 
        byte b = (byte)127;
        System.out.println(b);
        System.out.println(x);
        s1.append("1234");
        System.out.println(s1.length());
        System.out.println(s1.capacity());
    }
    
}
