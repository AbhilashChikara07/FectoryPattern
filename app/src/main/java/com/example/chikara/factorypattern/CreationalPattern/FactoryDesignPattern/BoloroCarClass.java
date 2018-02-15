package com.example.chikara.factorypattern.CreationalPattern.FactoryDesignPattern;

/**
 * Created by chikara on 2/15/18.
 */

public class BoloroCarClass extends CarInterface {
    private String car;

    BoloroCarClass(String car) {
        this.car = car;
    }

    @Override
    String getCar() {
        return car;
    }
}
