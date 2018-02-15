package com.example.chikara.factorypattern.CreationalPattern.AbstractFactoryPattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.chikara.factorypattern.R;

/**
 * Created by chikara on 2/15/18.
 */

public class InfoClass extends AppCompatActivity {

    /*
    * This pattern is a advance version of fectory pattern. In Fectory pattern
    * we use if and else conditon to get class object.
    *
    * Abstract fectory pattern is called as rid of if and else .
    * Also called as fectory of fectories.
    * */

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Car swiftCar = CarFectory.getCar(new SwiftFectory("SWIFT"));
        swiftCar.toString();
        Car brezzaCar = CarFectory.getCar(new BrezzaFectory("BREZZA"));
        brezzaCar.toString();
    }
}
