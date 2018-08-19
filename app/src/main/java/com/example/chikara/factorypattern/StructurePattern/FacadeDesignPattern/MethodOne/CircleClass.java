package com.example.chikara.factorypattern.StructurePattern.FacadeDesignPattern.MethodOne;

import android.util.Log;

public class CircleClass implements Shape {

    @Override
    public void draw(String color) {
        Log.e("CircleClass COLOR :- ", "" + color);
    }

}
