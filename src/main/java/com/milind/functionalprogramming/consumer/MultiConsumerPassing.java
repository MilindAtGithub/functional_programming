package com.milind.functionalprogramming.consumer;

import java.util.function.Consumer;

/**
 * This is the class which will demo how some value can be passed to the
 * multiple consumers
 */
public class MultiConsumerPassing {

    public static void main(String[] args){
        //Dad Consumer
        Consumer<Double> dad = new Consumer<Double>() {
            public void accept(Double aDouble) {
                System.out.println("Notify Salary to Dad: "+aDouble);
            }
        };
        //Mom Consumer
        Consumer<Double> mom = salary -> {
            salary+=100;
            System.out.println("Notify Salary to Mom: "+salary);
        };
        //For Others
        Consumer<Double> others = salary -> System.out.println("Notify Salary to Others: "+salary);
        // Chain the consumers
        Consumer<Double> chain = dad.andThen(mom).andThen(others);
        attendInterview(chain);
    }

    public static  void attendInterview( Consumer<Double> consumer){
        System.out.println("Selected and offer is :"+1999.90);
        consumer.accept(1999.90);
    }
}
