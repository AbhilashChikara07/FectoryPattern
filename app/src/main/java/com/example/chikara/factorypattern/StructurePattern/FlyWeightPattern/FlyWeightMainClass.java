package com.example.chikara.factorypattern.StructurePattern.FlyWeightPattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.chikara.factorypattern.R;

import java.util.HashMap;

/**
 * Created by chikara on 2/14/18.
 */

/*
* Flyweight is one of the structure design pattern which
* used when you are low on memory devices and you need to create lots of object of a class.
* So we can save object of classes.
* Using HasMap we can save object and get same object when required
* */

public class FlyWeightMainClass extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircleClass circleClass = new CircleClass();
        HoldClassObjects holdClassObject = new HoldClassObjects();

        HashMap<String, DrawInterface> hashMapObject = holdClassObject.getMap();
        hashMapObject.put("CircleClassObject", circleClass);
        holdClassObject.saveObject(hashMapObject);


        LineClass lineClass = new LineClass();
        hashMapObject.put("LineClassObject", lineClass);
        holdClassObject.saveObject(hashMapObject);


        CircleClass tempCircleClassObj = (CircleClass) hashMapObject.get("CircleClassObject");
        tempCircleClassObj.draw();

    }
}
