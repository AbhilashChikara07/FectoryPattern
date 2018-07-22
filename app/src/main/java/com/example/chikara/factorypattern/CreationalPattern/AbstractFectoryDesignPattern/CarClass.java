package com.example.chikara.factorypattern.CreationalPattern.AbstractFectoryDesignPattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import in.oku.serviceproject.designPattern.F.AbstractFectoryDesignPattern.SwiftFectoryClass;

public class CarClass extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CarRequirementClass mBrezzaCarRequirementClass =
                new BrezzaFectoryClass(
                        "MRF",
                "BREZZA").getCarClassObj();

        CarRequirementClass mSwiftCarRequirementClass =
                new SwiftFectoryClass(
                        "MRF",
                        "SWIFT").getCarClassObj();

        Log.e("BREZZA-CAR",""+mBrezzaCarRequirementClass.toString());
        Log.e("SWIFT-CAR",""+mSwiftCarRequirementClass.toString());

    }

}
