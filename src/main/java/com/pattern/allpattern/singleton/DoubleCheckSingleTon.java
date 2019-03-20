package com.pattern.allpattern.singleton;

import java.io.Serializable;

/**
 * @Copyright (C) 2019
 * @Description: TODO
 * @Author dp_blue
 * @Date 2019-03-20 11:48
 */
public class DoubleCheckSingleTon implements Serializable {
    private static volatile DoubleCheckSingleTon instance;
    private DoubleCheckSingleTon(){}
    public static DoubleCheckSingleTon getInstance(){
        if(instance == null){
            synchronized (DoubleCheckSingleTon.class){
                if(instance == null){
                    instance = new DoubleCheckSingleTon();
                }
            }
        }
        return instance;
    }
    private Object readResolve(){
        return instance;
    }
}
