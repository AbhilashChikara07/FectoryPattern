package com.example.chikara.factorypattern.BehaviourPattern;

import android.util.Log;

public class UserClass implements ObserverInterface{

    @Override
    public void update() {
        Log.e("UserClass","update");
    }

}
