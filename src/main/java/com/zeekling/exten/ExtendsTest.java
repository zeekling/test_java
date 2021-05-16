package com.zeekling.exten;

/**
 * @author zeekling
 * @apiNote https://www.nowcoder.com/question/next?pid=30695833&qid=15977&tid=44372102
 * @since 2021-05-16
 */
public class ExtendsTest {

    public static void main(String[] args) {
        Base base = new Son();
        base.method();
        //base.methodB();
    }

}

class Base
{
    public void method()
    {
        System.out.println("Base");
    }
}
class Son extends Base
{
    public void method()
    {
        System.out.println("Son");
    }

    public void methodB()
    {
        System.out.println("SonB");
    }
}
