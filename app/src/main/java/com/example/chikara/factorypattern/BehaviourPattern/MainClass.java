package com.example.chikara.factorypattern.BehaviourPattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.chikara.factorypattern.R;

/*
 * Observer design pattern is used when users are intrested in object state.
 * */

public class MainClass extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserClass userClass1 = new UserClass();
        UserClass userClass2 = new UserClass();
        UserClass userClass3 = new UserClass();
        UserClass userClass4 = new UserClass();

        RedDressClass redDressClass = new RedDressClass(userClass4, true);

        redDressClass.addObserver(userClass1);
        redDressClass.setInStock(false);

        redDressClass.addObserver(userClass2);
        redDressClass.setInStock(false);

        redDressClass.addObserver(userClass3);
        redDressClass.setInStock(true);

        redDressClass.notifyObserver();
    }

}
