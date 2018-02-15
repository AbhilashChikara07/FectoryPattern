package com.example.chikara.factorypattern.CreationalPattern.AbstractFactoryPattern;

/**
 * Created by chikara on 2/14/18.
 */

public class Swift extends Car {

    String carName;

    Swift(String carName) {
        this.carName = carName;
    }

    @Override
    public String getName() {
        return carName;
    }
}
