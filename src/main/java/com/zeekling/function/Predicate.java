package com.zeekling.function;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zeekling
 * @apiNote 函数式编程测试
 * @since 2021-07-04
 */
@FunctionalInterface
public interface Predicate<T> {

    boolean test(T t);



}
