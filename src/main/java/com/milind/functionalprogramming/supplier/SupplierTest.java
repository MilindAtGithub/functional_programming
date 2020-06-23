package com.milind.functionalprogramming.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String args[]){

        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new Random().nextInt();
            }
        };
        System.out.println(String.valueOf(supplier.get()));
    }
}
