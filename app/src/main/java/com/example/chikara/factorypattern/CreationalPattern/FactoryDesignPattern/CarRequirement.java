package com.example.chikara.factorypattern.CreationalPattern.FactoryDesignPattern;

import android.util.Log;

/**
 * Created by chikara on 2/12/18.
 */

public abstract class CarRequirement {

    public abstract String getTyre();

    public abstract String getStaring();

    public abstract String getAudioPlayer();

    @Override
    public String toString() {
        String ss = "Tyre name is :- " + getTyre()
                + " Staring type is :- " + getStaring()
                + " Audio player name :- " + getAudioPlayer();
        Log.e("CAR :- ", "" + ss);

        return ss;
    }
}
