package com.zeekling.integer;

public class TestDemoCount {

    private int count;
    public static void main(String[] args) {
        TestDemoCount test=new TestDemoCount(88);
        System.out.println(test.count);

        int i = 5;
        int j = 10;
        System.out.println(i + ~j);
    }
    TestDemoCount(int a) {
        count=a;
    }
}
