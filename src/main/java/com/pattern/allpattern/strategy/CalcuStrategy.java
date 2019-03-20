package com.pattern.allpattern.strategy;

/**
 * @Copyright (C) 2019
 * @Description: TODO
 * @Author dp_blue
 * @Date 2019-03-20 14:39
 */
public class CalcuStrategy {
    private Calculation calculation;
    CalcuStrategy(Calculation calculation){
        this.calculation = calculation;
    }
    /**
     * 策略方法，对俩数进行计算
     */
    public void strategyMethod(int numOne, int numTwo){
        calculation.calTwoNum(numOne, numTwo);
    }
}
