package com.example.chikara.factorypattern.StructurePattern.BridgeDesignPattern;

public abstract class Shape {

    Color color;

    public Shape(Color c) {
        this.color = c;
    }

    abstract public void applyColor();

}
