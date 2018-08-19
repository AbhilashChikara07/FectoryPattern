package com.example.chikara.factorypattern.StructurePattern.FlyWeightPattern;

import java.util.HashMap;

/**
 * Created by chikara on 2/14/18.
 */

public class HoldClassObjects {

    HashMap<String, DrawInterface> map;

    public HashMap<String, DrawInterface> getMap() {
        if (map == null) {
            synchronized (HoldClassObjects.this) {
                return new HashMap<>();
            }
        } else {
            return map;
        }
    }


    public void saveObject(HashMap<String, DrawInterface> map) {
        this.map = map;
    }

}
