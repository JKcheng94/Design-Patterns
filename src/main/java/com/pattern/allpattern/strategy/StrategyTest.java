package com.pattern.allpattern.strategy;

/**
 * @Copyright (C) 2019
 * @Description: TODO
 * @Author dp_blue
 * @Date 2019-03-20 14:44
 */
public class StrategyTest {
    public static void main(String[] args){
        Calculation strategy = new Divide();
        CalcuStrategy calcuStrategy = new CalcuStrategy(strategy);
        calcuStrategy.strategyMethod(2,2);
    }
}
