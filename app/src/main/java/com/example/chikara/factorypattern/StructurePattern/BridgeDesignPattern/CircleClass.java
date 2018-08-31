package com.example.chikara.factorypattern.StructurePattern.BridgeDesignPattern;

public class CircleClass extends Shape {

    public CircleClass(Color c) {
        super(c);
        applyColor();
    }

    @Override
    public void applyColor() {
        if (color != null)
            color.applyColor();
    }
}
