package com.example.chikara.factorypattern.CreationalPattern.BuilderPattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.chikara.factorypattern.R;

/*
 * Builder pattern is one type of creational pattern.
 * Builder pattern is also used for providing best way of create object.
 * When we are passing too much argument . By using this we create an
 * entity to hold all related data.
 * */

public class CarClass extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BuilderEntity builderEntity = new BuilderEntity();
        builderEntity.carBreak = "CAR-BREAK";
        builderEntity.carSeatBalt = "CAR-SEAT-BELT";
        builderEntity.carStaring = "CAR-STARING";

        /*
         * By using multiple method we can create class object.
         * */

        CarInterface carInterface = new BrezzaCar(builderEntity);
        carInterface = new SwiftCar(builderEntity);
        carInterface.toString();

        /*
         * Either by this.
         * */

        CarRequirement carRequirement = new BrezzaCar()
                .getCarRequirement(builderEntity);
        carRequirement.toString();

        carRequirement = new SwiftCar()
                .getCarRequirement(builderEntity);
        carRequirement.toString();


    }

}
