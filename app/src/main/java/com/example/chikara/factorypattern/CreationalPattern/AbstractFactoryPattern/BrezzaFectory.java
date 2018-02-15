package com.example.chikara.factorypattern.CreationalPattern.AbstractFactoryPattern;

import android.util.Log;

/**
 * Created by chikara on 2/14/18.
 */

public class BrezzaFectory implements FectoryInterface {
    private String carName;

    public BrezzaFectory(String carName) {
        this.carName = carName;
    }

    @Override
    public Car getAssociateCar() {
        return new Brezza(carName);
    }

    @Override
    public void myName() {
        Log.e("myname","myname");
    }

}
