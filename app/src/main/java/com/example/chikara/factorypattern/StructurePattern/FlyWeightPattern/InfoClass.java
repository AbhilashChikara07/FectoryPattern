package com.example.chikara.factorypattern.StructurePattern.FlyWeightPattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.chikara.factorypattern.R;

import java.util.HashMap;

/**
 * Created by chikara on 2/14/18.
 */


public class InfoClass extends AppCompatActivity {

        /*
    * This method is when you very fast making object.
    * So by using FlyWeightPattern we can save object.
    *
    * Using HasMap we can save object and get same object when required.
    * */

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircleClass circleClass = new CircleClass();
        HoldClassObject holdClassObject = new HoldClassObject();

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
