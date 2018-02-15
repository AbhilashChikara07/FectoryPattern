package com.example.chikara.factorypattern.CreationalPattern.SingaltonDesignPattern;

/**
 * Created by chikara on 2/12/18.
 */

public class SingleTonClass {
/*
    Singleton pattern restricts the instantiation of a class and ensures that only one
    instance of the class exists in the java virtual machine.

    The singleton class must provide a global access point to get the instance of the class.

    Singleton pattern is used for logging, drivers objects, caching and thread pool.

    Singleton design pattern is also used in other design patterns like Abstract Factory,
    Builder, Prototype, Facade etc.

*/

    public static SingleTonClass mClassObj;
    public static SingleTonClass INSTANCE = new SingleTonClass();

    public static SingleTonClass getInstanceMethodOne() {
        if (mClassObj == null) {
            synchronized (SingleTonClass.class) {
                mClassObj = new SingleTonClass();
                return mClassObj;
            }
        } else {
            return mClassObj;
        }
    }

    public static SingleTonClass getInstanceMethodTwo() {
        if (mClassObj == null) {
            mClassObj = new SingleTonClass();
            return mClassObj;
        } else {
            return mClassObj;
        }
    }

    public static SingleTonClass getInstanceMethodThree() {
        return INSTANCE;
    }

}
