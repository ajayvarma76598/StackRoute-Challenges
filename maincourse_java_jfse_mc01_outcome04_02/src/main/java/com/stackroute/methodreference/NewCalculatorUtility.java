package com.stackroute.methodreference;

import java.util.function.BiFunction;

/* Complete the class as per the requirements given in PROBLEM.md */
public class NewCalculatorUtility extends CalculatorUtility{
    @Override
    public double compute(int num1, int num2){ return   Math.pow(num1,num2); }

    public double getPowerResult(int x, int y){
        BiFunction<Integer, Integer, Double> power = this::compute;
        return power.apply(x,y);
    }
    public double getProductResult(int x, int y) {
        BiFunction<Integer, Integer, Double> product = NewCalculatorUtility.super::compute;
        return product.apply(x, y);
    }

}
