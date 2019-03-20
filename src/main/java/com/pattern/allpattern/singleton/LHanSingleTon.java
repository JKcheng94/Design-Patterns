package com.pattern.allpattern.singleton;

/**
 * @Copyright (C) 2019
 * @Description: TODO
 * @Author dp_blue
 * @Date 2019-03-20 11:32
 */
public class LHanSingleTon {
    private static LHanSingleTon lHanSingleTon;
    private LHanSingleTon(){}
    public static LHanSingleTon getInstance(){
        if(lHanSingleTon == null){
            lHanSingleTon = new LHanSingleTon();
        }
        return lHanSingleTon;
    }
}
