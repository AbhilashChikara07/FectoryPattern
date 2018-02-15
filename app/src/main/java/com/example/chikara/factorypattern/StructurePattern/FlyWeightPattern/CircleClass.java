package com.example.chikara.factorypattern.StructurePattern.FlyWeightPattern;

import android.util.Log;

/**
 * Created by chikara on 2/14/18.
 */

public class CircleClass implements DrawInterface {
    @Override
    public void draw() {
        Log.e("CircleClass", "draw method call");
    }
}
