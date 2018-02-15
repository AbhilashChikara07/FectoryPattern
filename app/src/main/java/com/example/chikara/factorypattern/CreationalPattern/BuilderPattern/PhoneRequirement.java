package com.example.chikara.factorypattern.CreationalPattern.BuilderPattern;

/**
 * Created by chikara on 2/13/18.
 */

public abstract class PhoneRequirement {

    abstract String getBattery();

    abstract String getDisplay();

    @Override
    public String toString() {
        return "Battery is :- " + getBattery() + " Display is :- " + getDisplay();
    }

}
