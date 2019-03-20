package com.pattern.allpattern.strategy;

/**
 * @Copyright (C) 2019
 * @Description: TODO
 * @Author dp_blue
 * @Date 2019-03-20 14:32
 */
public class Plus implements Calculation {
    @Override
    public void calTwoNum(int numOne, int numTwo) {
        System.out.println("加法策略：" + (numOne + numTwo));
    }
}
