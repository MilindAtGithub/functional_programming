package com.milind.functionalprogramming.predicate;

import com.sun.scenario.effect.impl.state.AccessHelper;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.function.Predicate;

/**
 * This will show how to pass condition dynamically to a method
 */
public class MultiPredicate {

    public static void main(String args[]){
        //Even
        Predicate<Integer> even = a -> a %2 ==0;
        // Positive
        Predicate<Integer> postivie = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer>0;
            }
        };
        //Less than 100
        Predicate<Integer> lessThan100 = a -> a<100;
        //Chain
        Predicate<Integer> chain = even.and(postivie).and(lessThan100);
        System.out.println(check(chain, -200));
        System.out.println(check(postivie, 500));

    }

    public static boolean check(Predicate <Integer> p, int i){
        return p.test(i);
    }

}
