package com.pattern.allpattern.simplefactory;

/**
 * @Copyright (C) 2019
 * @Description: TODO
 * @Author dp_blue
 * @Date 2019-03-18 10:38
 */
public class CarFactory {
    public ICar getCarInstance(CarType carType) throws Exception {
        switch (carType) {
            case Benz:
                return new Benz();
            case BMW:
                return new BMW();
            case Audi:
                return new Audi();
            default:
                throw new Exception("没车了！贼尴尬！");
        }
    }
    
}
