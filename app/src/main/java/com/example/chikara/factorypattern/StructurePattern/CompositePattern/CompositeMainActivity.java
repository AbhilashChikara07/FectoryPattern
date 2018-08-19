package com.example.chikara.factorypattern.StructurePattern.CompositePattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.chikara.factorypattern.R;

/*
* Composite design pattern is one of the structure design pattern
* which used when group of object is treated the same way
* as single instance of same type.
* */

public class CompositeMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DesignClass designClass = new DesignClass();
        designClass.addShapeClass(new TrangelClass());
        designClass.addShapeClass(new CircleClass());

        designClass.setColor("RED");
    }
}
