package com.zeekling.thread;

/**
 * @author zeekling
 * @apiNote https://www.nowcoder.com/question/next?pid=30695833&qid=4339&tid=44372102
 * @since 2021-05-16
 */
public class ThreadTest {

    public static void main(String args[]) {
        Thread t = new Thread() {
            public void run() {
                dianping();

            }
        };
        t.run();
        System.out.print("dazhong");
    }

    static void dianping() {
        System.out.print("dianping");
    }

}
