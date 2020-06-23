package com.milind.functionalprogramming.functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionTest {

    public static void main(String args[]){

        BiFunction<Integer, Integer, Integer> area = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer*integer2;
            }
        };
        Function<Integer,Integer> volume = v -> v*100;

        System.out.println(area.andThen(volume).apply(3,4));
    }
}
