package com.pattern.allpattern.factorymethod;

/**
 * @Copyright (C) 2019
 * @Description: TODO
 * @Author dp_blue
 * @Date 2019-03-18 14:53
 */
public class BenzCarFactory implements ICarFactory {
    @Override
    public ICar createCar() {
        return new Benz();
    }
}
