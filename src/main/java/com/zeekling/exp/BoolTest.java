package com.zeekling.exp;

/**
 * @author zeekling
 * @apiNote https://www.nowcoder.com/test/question/done?tid=44355378&qid=7672#summary
 * @since 2021-05-16
 */
public class BoolTest {

    private static int j = 0;

    private static Boolean methodB(int k) {
        j += k;
        return true;
    }

    public static void methodA(int i) {
        boolean b;
        b = i < 10 | methodB(4);
        b = i < 10 || methodB(8);


    }

    public static void main(String args[]) {
        methodA(0);
        System.out.println(j);
    }
}
