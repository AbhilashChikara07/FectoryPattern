package com.example.chikara.factorypattern.CreationalPattern.AbstractFectoryDesignPattern;

public abstract class CarRequirementClass {
    abstract String getTyreName();

    abstract String getCarLogo();

    @Override
    public String toString() {
        return "CAR TYRE NAME :- " + getTyreName() + "CAR LOGO IS :- " + getCarLogo();
    }

}
