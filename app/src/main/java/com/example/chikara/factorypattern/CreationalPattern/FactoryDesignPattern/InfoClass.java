package com.example.chikara.factorypattern.CreationalPattern.FactoryDesignPattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.chikara.factorypattern.R;

/**
 * Created by chikara on 2/15/18.
 */

public class InfoClass extends AppCompatActivity {

    /*
    * Fectory design pattern is known as SUPER CLASS with lots of SUB CLASS.
    * But disadvantage of this pattern is you only can get class object base of if else condition.
    * Suppose there are lots of class then you need to handle all classes in if and else code.
    *
    * */

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarInterface boloroCarObject = new CarClass().
                getCar("BoloroCarClass", "BOLORO");
        CarInterface dusterCarObj = new CarClass().
                getCar("DusterCarClass", "DUSTER");

        boloroCarObject.toString();
        dusterCarObj.toString();
    }
}
