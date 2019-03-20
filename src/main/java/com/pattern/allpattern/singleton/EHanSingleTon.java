package com.pattern.allpattern.singleton;

/**
 * @Copyright (C) 2019
 * @Description: TODO
 * @Author dp_blue
 * @Date 2019-03-20 11:23
 */
public class EHanSingleTon {
    private static EHanSingleTon eHanSingleTon = new EHanSingleTon();
    private EHanSingleTon(){
        
    }
    public static EHanSingleTon getInstance(){
        return eHanSingleTon;
    }
}
