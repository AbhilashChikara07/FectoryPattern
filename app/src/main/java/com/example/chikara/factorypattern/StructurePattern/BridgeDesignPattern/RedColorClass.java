package com.example.chikara.factorypattern.StructurePattern.BridgeDesignPattern;

import android.util.Log;

public class RedColorClass implements Color {

    @Override
    public void applyColor() {
        Log.e("RedColorClass", "RedColorClass");
    }

}
