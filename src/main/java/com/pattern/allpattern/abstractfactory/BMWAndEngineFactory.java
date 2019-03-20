package com.pattern.allpattern.abstractfactory;

/**
 * @Copyright (C) 2019
 * @Description: TODO
 * @Author dp_blue
 * @Date 2019-03-20 9:47
 */
public class BMWAndEngineFactory implements IProductFactory {
    @Override
    public ICar getMyCar() {
        return new BMW();
    }
    
    @Override
    public IEngine getMyEngine() {
        return new BMWEngine();
    }
}
