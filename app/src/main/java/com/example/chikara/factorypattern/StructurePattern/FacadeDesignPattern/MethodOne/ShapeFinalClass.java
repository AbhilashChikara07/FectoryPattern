package com.example.chikara.factorypattern.StructurePattern.FacadeDesignPattern.MethodOne;

public class ShapeFinalClass {

    CircleClass mCircleClass;
    OvalClass mOvalClass;

    ShapeFinalClass() {
        mCircleClass = new CircleClass();
        mOvalClass = new OvalClass();
    }

    void drawCircle(String mColor) {
        mCircleClass.draw(mColor);
    }

    void drawOval(String mColor){
        mOvalClass.draw(mColor);
    }

}
