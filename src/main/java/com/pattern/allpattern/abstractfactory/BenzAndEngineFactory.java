package com.pattern.allpattern.abstractfactory;

/**
 * @Copyright (C) 2019
 * @Description: TODO
 * @Author dp_blue
 * @Date 2019-03-20 9:46
 */
public class BenzAndEngineFactory implements IProductFactory {
    @Override
    public ICar getMyCar() {
        return new Benz();
    }
    
    @Override
    public IEngine getMyEngine() {
        return new BenzEngine();
    }
}
