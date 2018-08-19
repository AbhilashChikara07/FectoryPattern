package com.example.chikara.factorypattern.CreationalPattern.FectoryDesignPattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/*
 * Creational design pattern is used for providing a different different ways
 * of providing class object.
 * Factory design pattern is used when we have super class with lots of sub-classes.
 * Then it return class object on base of input.
 * Using IF and ELSE condition we return class object.
 * */

public class CarClass extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CarRequirementInterface mCarRequirementInterface =
                WhichCarClass.getCar("Brezza",
                        "MRF",
                        "BREZZA");
        Log.e("DEMO", "" + mCarRequirementInterface.toString());
    }

}
