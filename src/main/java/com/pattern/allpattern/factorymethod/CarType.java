package com.pattern.allpattern.factorymethod;

/**
 * @Copyright (C) 2019
 * @Description: TODO
 * @Author dp_blue
 * @Date 2019-03-18 10:44
 */
public enum CarType {
    /**
     * 奔驰
     */
    Benz(0),
    /**
     * 宝马
     */
    BMW(1),
    /**
     * 奥迪
     */
    Audi(2);
    
    CarType(int num) {}
}
