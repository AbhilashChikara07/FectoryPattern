package com.example.chikara.factorypattern.CreationalPattern.AbstractFectoryDesignPattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/*
 * First all Creational pattern are used for creating providing
 * different different approaches or way that how a object can be created.
 * Before direct read Abstract design pattern is not a good approach.
 * Because Abstract-Creational pattern is a advance version of Factory-Creational design pattern.
 * By using Abstract-Creational design pattern :- When
 * a super class is derived with lots of sub-classes. Then object
 * creation can be very difficult. In Factory we create object of
 * different different classes by using IF and ELSE condition.
 * */

public class CarClass extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CarRequirementClass mBrezzaCarRequirementClass =
                new BrezzaFactoryClass(
                        "MRF",
                        "BREZZA").getCarClassObj();

        CarRequirementClass mSwiftCarRequirementClass =
                new SwiftFactoryClass(
                        "MRF",
                        "SWIFT").getCarClassObj();

        Log.e("BREZZA-CAR", "" + mBrezzaCarRequirementClass.toString());
        Log.e("SWIFT-CAR", "" + mSwiftCarRequirementClass.toString());

    }

}
