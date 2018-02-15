package com.example.chikara.factorypattern.CreationalPattern.FactoryDesignPattern;

import android.util.Log;

/**
 * Created by chikara on 2/15/18.
 */

public abstract class CarInterface {
    abstract String getCar();

    @Override
    public String toString() {
        Log.e("CAR NAME IS :- ", "" + getCar());
        return getCar();
    }
}
