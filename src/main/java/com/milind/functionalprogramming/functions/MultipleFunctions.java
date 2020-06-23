package com.milind.functionalprogramming.functions;

import java.util.function.Function;

/**
 * Creating the workflow with multiple functions
 */
public class MultipleFunctions {

    public static void main(String args[]){


        Function<Integer,Double> makeHalf = new Function<Integer, Double>() {
            @Override
            public Double apply(Integer integer) {
                return new Double(integer/2);
            }
        };

        Function<Double,Integer> doubleIt = a ->  (int)Math.round(a/2);

        Function<Integer, Emp> empFunction = s-> new Emp(s);

        Function<Integer, Integer> t = p ->{
            if(p>=100){
                return p*6;
            } else {
                return p;
            }
        };

        executeLogic(t.andThen(makeHalf).andThen(doubleIt).andThen(empFunction),100);

       // executeLogic(makeHalf.andThen(doubleIt).andThen(t).andThen(empFunction),100);
    }

    public static void executeLogic(Function<Integer, Emp>  function, Integer i){

        function.apply(i);
    }
}


class  Emp {
    public Emp(int a) {
        System.out.println("Constructor called with value: "+a);
    }
}