package com.example.chikara.factorypattern.StructurePattern.FacadeDesignPattern.MethodOne;

import android.util.Log;

public class OvalClass implements Shape{

    @Override
    public void draw(String color) {
        Log.e("OvalClass COLOR :- ",""+color);
    }

}
