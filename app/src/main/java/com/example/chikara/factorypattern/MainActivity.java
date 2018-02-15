package com.example.chikara.factorypattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.chikara.factorypattern.CreationalPattern.AbstractFactoryPattern.BrezzaFectory;
import com.example.chikara.factorypattern.CreationalPattern.AbstractFactoryPattern.Car;
import com.example.chikara.factorypattern.CreationalPattern.AbstractFactoryPattern.CarFectory;
import com.example.chikara.factorypattern.CreationalPattern.AbstractFactoryPattern.SwiftFectory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car swiftCar = CarFectory.getCar(new SwiftFectory("SWIFT"));

    }

}
