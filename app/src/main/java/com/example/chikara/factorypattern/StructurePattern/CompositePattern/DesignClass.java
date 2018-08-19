package com.example.chikara.factorypattern.StructurePattern.CompositePattern;

import java.util.ArrayList;

public class DesignClass {

    ArrayList<ShapeInterface> mShapeList = new ArrayList<>();


    public void addShapeClass(ShapeInterface shapeInterface) {
        mShapeList.add(shapeInterface);
    }

    void setColor(String mColor) {
        for (ShapeInterface shapeInterface : mShapeList) {
            shapeInterface.draw(mColor);
        }
    }

}
