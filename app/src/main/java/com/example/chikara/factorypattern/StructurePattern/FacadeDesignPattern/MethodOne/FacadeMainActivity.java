package com.example.chikara.factorypattern.StructurePattern.FacadeDesignPattern.MethodOne;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.chikara.factorypattern.R;


/*
 * Facade design pattern is one of the structure design pattern. A structure design
 * pattern is the one which used for defining a class structure.
 * Facade design pattern is used to hide complexity of the system. For example
 * you are accessing SQL LITE database. In that case SQL LITE data base hide all
 * complex information and provide access to create table.
 * */

public class FacadeMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShapeFinalClass mShapeFinalClass = new ShapeFinalClass();
        mShapeFinalClass.drawCircle("REED");
        mShapeFinalClass.drawOval("YELLOW");

    }

}
