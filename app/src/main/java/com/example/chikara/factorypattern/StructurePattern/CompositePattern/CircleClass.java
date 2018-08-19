package com.example.chikara.factorypattern.StructurePattern.CompositePattern;

import android.util.Log;

public class CircleClass implements ShapeInterface {

    @Override
    public void draw(String color) {
        Log.e("CircleClass :- ", "" + color);
    }

}
