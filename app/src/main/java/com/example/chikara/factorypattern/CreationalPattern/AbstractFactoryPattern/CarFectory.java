package com.example.chikara.factorypattern.CreationalPattern.AbstractFactoryPattern;

/**
 * Created by chikara on 2/14/18.
 */

public class CarFectory {

    public static Car getCar(FectoryInterface fectoryInterface) {
        return fectoryInterface.getAssociateCar();
    }

}
