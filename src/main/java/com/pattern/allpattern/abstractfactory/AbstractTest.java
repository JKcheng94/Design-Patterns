package com.pattern.allpattern.abstractfactory;

/**
 * @Copyright (C) 2019
 * @Description: TODO
 * @Author dp_blue
 * @Date 2019-03-20 9:49
 */
public class AbstractTest {
    
    public static void main(String[] args){
        IProductFactory benzAndEngine = new BenzAndEngineFactory();
        benzAndEngine.getMyCar().getMyCar();
        benzAndEngine.getMyEngine().myEngine();
        IProductFactory bmwAndEngine = new BMWAndEngineFactory();
        bmwAndEngine.getMyCar().getMyCar();
        bmwAndEngine.getMyEngine().myEngine();
    }
}
