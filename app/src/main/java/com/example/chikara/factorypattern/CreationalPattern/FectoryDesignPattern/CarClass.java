package com.example.chikara.factorypattern.CreationalPattern.FectoryDesignPattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class CarClass extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CarRequirementInterface mCarRequirementInterface =
                WhichCarClass.getCar("Brezza",
                        "MRF",
                        "BREZZA");
//        Log.e("DEMO", "" + mCarRequirementInterface.toString());
    }
}
