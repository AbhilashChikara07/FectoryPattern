package com.example.chikara.factorypattern.StructurePattern.FacadeDesignPattern.MethodTwo;

import android.util.Log;

public class VegHotel implements HotelMenuInterface {

    @Override
    public void getMenu(String mMenu) {
        Log.e("VEG HOTEL MENU :- ", "" + mMenu);
    }

}
