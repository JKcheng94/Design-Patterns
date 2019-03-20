package com.pattern.allpattern.singleton;

import java.io.*;

/**
 * @Copyright (C) 2019
 * @Description: TODO
 * @Author dp_blue
 * @Date 2019-03-20 11:27
 */
public class SingleTonTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DoubleCheckSingleTon eHanSingleTon1 = DoubleCheckSingleTon.getInstance();
        DoubleCheckSingleTon eHanSingleTon2 = DoubleCheckSingleTon.getInstance();
        DoubleCheckSingleTon doubleCheckSingleTon = deepCopy(eHanSingleTon1);
        System.out.println(eHanSingleTon1 == eHanSingleTon2);
        System.out.println(doubleCheckSingleTon == eHanSingleTon1);
    }
    
    private static <T> T deepCopy(Object obj) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream osw = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(osw);
        oos.writeObject(obj);
        ByteArrayInputStream bais = new ByteArrayInputStream(osw.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return (T)ois.readObject();
    }
}
