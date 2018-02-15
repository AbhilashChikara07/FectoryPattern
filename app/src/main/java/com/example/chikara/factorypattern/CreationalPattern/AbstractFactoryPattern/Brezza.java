package com.example.chikara.factorypattern.CreationalPattern.AbstractFactoryPattern;

/**
 * Created by chikara on 2/14/18.
 */

public class Brezza extends Car {
    String name;

    Brezza(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
