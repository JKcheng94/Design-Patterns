package com.pattern.allpattern.singleton;

/**
 * @Copyright (C) 2019
 * @Description: TODO
 * @Author dp_blue
 * @Date 2019-03-20 11:40
 */
public class StaticInnerSingleTon {
    private StaticInnerSingleTon(){}
    private static class SingleTonHook{
        private static final StaticInnerSingleTon instance = new StaticInnerSingleTon();
    }
    public static StaticInnerSingleTon getInstance(){
        return SingleTonHook.instance;
    }
}
