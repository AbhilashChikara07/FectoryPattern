package com.example.chikara.factorypattern.CreationalPattern.BuilderPattern;

public class SwiftCar implements CarInterface {

    SwiftCar(){}
    SwiftCar(BuilderEntity entity){
        getCarRequirement(entity);
    }

    @Override
    public CarRequirement getCarRequirement(BuilderEntity entity) {
        return new SwiftFactoryCar(entity);
    }

}
