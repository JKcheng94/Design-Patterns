package com.pattern.allpattern.abstractfactory;

/**
 * @Copyright (C) 2019
 * @Description: TODO
 * @Author dp_blue
 * @Date 2019-03-20 9:40
 */
public interface IProductFactory {
    ICar getMyCar();
    IEngine getMyEngine();
}
