package com.example.chikara.factorypattern.StructurePattern.FacadeDesignPattern.MethodTwo;

public class HotelClass {

    VegHotel mVegHotel;
    NonVegHotel mNonVegHotel;

    HotelClass() {
        mVegHotel = new VegHotel();
        mNonVegHotel = new NonVegHotel();
    }

    VegHotel getVegHotel() {
        return mVegHotel;
    }

    NonVegHotel getNonVegHotel() {
        return mNonVegHotel;
    }

}
