package com.pattern.allpattern.strategy;

/**
 * @Copyright (C) 2019
 * @Description: TODO
 * @Author dp_blue
 * @Date 2019-03-20 14:38
 */
public class Divide implements Calculation {
    @Override
    public void calTwoNum(int numOne, int numTwo) {
        System.out.println("除法策略：" + (numOne / numTwo));
    }
}
