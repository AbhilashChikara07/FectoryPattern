package com.example.chikara.factorypattern.StructurePattern.ProxyDesignPattern;

import android.util.Log;

public class RealInternet implements Internet {

    @Override
    public void connectTo(String hostName) {
        Log.e("HOST NAME :- ", "" + hostName);
    }

}
