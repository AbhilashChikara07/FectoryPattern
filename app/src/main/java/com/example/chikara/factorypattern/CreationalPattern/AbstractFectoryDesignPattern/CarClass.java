package com.example.chikara.factorypattern.CreationalPattern.AbstractFectoryDesignPattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


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
