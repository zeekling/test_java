package com.zeekling.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zeekling
 * @apiNote 函数式编程
 * @since 2021-07-04
 */
public class FunctionTest {

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for(T s: list){
            if(p.test(s)){
                results.add(s);
            }
        }
        return results;
    }


    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<String>(){{
            add("");
            add("1");
            add("2");
        }};
        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        List<String> nonEmpty = filter(listOfStrings, nonEmptyStringPredicate);
        System.out.println(Arrays.toString(nonEmpty.toArray()));

    }

}
