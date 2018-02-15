package com.example.chikara.factorypattern.CreationalPattern.FactoryDesignPattern;

/**
 * Created by chikara on 2/15/18.
 */

public class CarClass {

    CarInterface getCar(String type, String carName) {
        if ("BoloroCarClass".equalsIgnoreCase(type)) {
            return new BoloroCarClass(carName);
        } else if ("DusterCarClass".equalsIgnoreCase(type)) {
            return new DusterCarClass(carName);
        }
        return null;
    }

}
