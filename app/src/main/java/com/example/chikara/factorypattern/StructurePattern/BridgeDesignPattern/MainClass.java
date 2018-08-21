package com.example.chikara.factorypattern.StructurePattern.BridgeDesignPattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.chikara.factorypattern.R;

/*
 * Bridge design pattern is one of the structure design which define as :-
 * when we have two interface hierarchies as well as implemented,
 * then bridge design pattern is used to decouple both interface
 * and hide implementation detail from client.
 * */


public class MainClass extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RedColorClass redColorClass = new RedColorClass();
        CircleClass circleClass = new CircleClass(redColorClass);
    }

}
