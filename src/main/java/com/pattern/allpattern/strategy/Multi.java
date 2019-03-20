package com.pattern.allpattern.strategy;

/**
 * @Copyright (C) 2019
 * @Description: TODO
 * @Author dp_blue
 * @Date 2019-03-20 14:37
 */
public class Multi implements Calculation {
    @Override
    public void calTwoNum(int numOne, int numTwo) {
        System.out.println("乘法策略：" + (numOne * numTwo));
    }
}
