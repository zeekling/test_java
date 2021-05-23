package com.zeekling.string;

/**
 * @author zeekling
 * @apiNote https://www.nowcoder.com/question/next?pid=30796423&qid=15076&tid=44509101
 * @since 2021-05-23
 */
public class StringBufferTest {


    public static void main(String[] args) {

        StringBuffer a = new StringBuffer("A");

        StringBuffer b = new StringBuffer("B");

        operate(a, b);

        System.out.println(a + "." + b);
    }

    static void operate(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
    }
}
