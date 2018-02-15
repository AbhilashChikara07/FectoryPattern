package com.example.chikara.factorypattern.StructurePattern.FlyWeightPattern;

import android.util.Log;

/**
 * Created by chikara on 2/14/18.
 */

public class LineClass implements DrawInterface {

    @Override
    public void draw() {
        Log.e("LineClass", "draw");
    }

}
