package com.example.chikara.factorypattern.CreationalPattern.AbstractFactoryPattern;

import android.util.Log;

/**
 * Created by chikara on 2/14/18.
 */

public class SwiftFectory implements FectoryInterface {

    String carName;

    public SwiftFectory(String carName) {
        this.carName = carName;
    }

    @Override
    public Car getAssociateCar() {
        Log.e("call","call");
        return new Swift(carName);
    }

    @Override
    public void myName() {
        Log.e("myname","myname");
    }

}
