package com.pattern.allpattern.simplefactory;

/**
 * @Copyright (C) 2019
 * @Description: TODO
 * @Author dp_blue
 * @Date 2019-03-18 10:54
 */
public class FactoryTest {
    
    public static void main(String[] args) throws Exception {
        CarFactory carFactory = new CarFactory();
        ICar myBenz = carFactory.getCarInstance(CarType.Benz);
        myBenz.getMyCar();
        ICar myBMW = carFactory.getCarInstance(CarType.BMW);
        myBMW.getMyCar();
        ICar myAudi = carFactory.getCarInstance(CarType.Audi);
        myAudi.getMyCar();
    }
}
