package com.pattern.allpattern.factorymethod;

/**
 * @Copyright (C) 2019
 * @Description: TODO
 * @Author dp_blue
 * @Date 2019-03-18 10:54
 */
public class FactoryTest {
    
    public static void main(String[] args){
        ICarFactory benzCar = new BenzCarFactory();
        ICar benz = benzCar.createCar();
        ICarFactory bMWCar = new BMWCarFactory();
        ICar bmw = bMWCar.createCar();
        ICarFactory audiCar = new AudiCarFactory();
        ICar audi = audiCar.createCar();
        benz.getMyCar();
        bmw.getMyCar();
        audi.getMyCar();
    }
}
