package com.milind.functionalprogramming.customfunction;

/**
 * This will create the function interface and test the same.
 */
public class CustomFunctionTest {

    public static void main(String args[]){
        Area area = (x, y) -> x*y;
        System.out.println(area.getArea(4,5));
    }
}

@FunctionalInterface
interface  Area{
    int getArea(int x, int y);
}