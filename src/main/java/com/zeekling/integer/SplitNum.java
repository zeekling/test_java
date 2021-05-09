package com.zeekling.integer;

/**
 * 考察方法进栈与出栈的顺序。先进后出
 * 有个知识点，方法在出栈的时候，执行的是return语句。因为出栈就意味着方法结束并消费，如果没有return语句，那么方法出栈的时候什么都不执行，就直接销毁。
 * 1.执行split（12）时，执行代码System.out.print(split(number / 2))
 *     split（12/2）进栈，此时number=6；
 * 2.执行split（6）时，执行代码System.out.print(split(number / 2))
 *     split（6/2）进栈，此时number=3；
 * 3.执行split（3）时，
 * 1
 * 2
 * 3
 * 第1行 if (number % 2 != 0)
 * 第2行          System.out.print(split((number + 1) / 2));
 * 第3行    System.out.print(split(number / 2));
 *  按照顺序执行
 *  先执行第2行
 *             首先split（(3+1)/2）进栈，此时number=2，
 *             再执行split（2），那么split（2/2）进栈，此时number=1， 最后return 1，
 *             注意此时第2行代码还没有结束
 *             此时
 *             split（2/2）出栈，输出1；
 *             split（(3+1)/2）出栈，输出2；
 *    第二行代码结束，再执行第三行，此时number=3，执行System.out.print(split(number / 2))
 *            split（3/2）进栈，number=1，return，那么就需要出栈了
 * split（3/2）出栈，输出1
 * split（6/2）出栈，输出3
 * split（12/2）出栈，输出6；
 * 最终结果12136；
 *
 * split（number）方法，最终返回的是number这个值，所以split（n）出栈的输出结果就是n
 *
 * 整理：
 * split（12/2）进栈
 * split（6/2）进栈
 *
 * split（(3+1)/2）进栈
 * split（2/2）进栈
 *        split（2/2）出栈，输出1
 *         split（(3+1)/2）出栈，输出2
 *
 * split（2/2）进栈
 *         split（2/2）出栈，输出1
 *
 * split（6/2）出栈，输出3
 * split（12/2）出栈，输出6
 */
public class SplitNum {

    public static void main(String[] args) {
        split(12);
    }
    public static int split(int number) {
        if (number > 1) {
            if (number % 2 != 0) System.out.print(split((number + 1) / 2));
            System.out.print(split(number / 2));
        }
        return number;
    }

}
