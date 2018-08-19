package com.example.chikara.factorypattern.StructurePattern.FacadeDesignPattern.MethodTwo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.chikara.factorypattern.R;

public class MainClass extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HotelClass mHotelClass = new HotelClass();
        VegHotel mVegHotelObj = mHotelClass.getVegHotel();
        NonVegHotel mNonVegHotelObj = mHotelClass.getNonVegHotel();

    }

}
