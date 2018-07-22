package com.example.chikara.factorypattern.CreationalPattern.FectoryDesignPattern;

import android.util.Log;

public abstract class CarRequirementInterface {

    abstract String getTyre();

    abstract String getLogo();

    @Override
    public String toString() {
        Log.e("CAR TYRE IS :- ", "" + getTyre());
        Log.e("CAR LOGO IS :- ", "" + getLogo());
        return "CAR TYRE IS :- " + getTyre() + ", CAR LOGO IS :- " + getLogo();
    }

}
