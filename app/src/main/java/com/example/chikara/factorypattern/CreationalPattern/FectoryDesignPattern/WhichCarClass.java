package com.example.chikara.factorypattern.CreationalPattern.FectoryDesignPattern;

public class WhichCarClass {


    static CarRequirementInterface getCar(String mWhichCar, String mCarTyre, String mCarLogo) {
        if ("Brezza".equalsIgnoreCase(mWhichCar))
            return new BrezzaCarClass(mCarTyre, mCarLogo);
        else if ("Swift".equalsIgnoreCase(mWhichCar))
            return new SwiftCarClass(mCarTyre, mCarLogo);
        return null;
    }


}
