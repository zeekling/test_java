package com.zeekling.integer;


public class IntegerTest {

    public static void main(String[] args) {

        int a = 10;
        // 方法内定义的变量没有初始值，必须要进行初始化。 类中定义的变量可以不需要赋予初始值，默认初始值为0。
        int b = 0;
        int c;
        if (a > 50) {
            b = 9;
        }
        c = b + a;
        System.out.println("c=" + c);
    }
}
