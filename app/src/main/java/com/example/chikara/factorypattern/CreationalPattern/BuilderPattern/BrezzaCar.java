package com.example.chikara.factorypattern.CreationalPattern.BuilderPattern;

public class BrezzaCar implements CarInterface {

    BrezzaCar(){}

    BrezzaCar(BuilderEntity entity) {
        getCarRequirement(entity);
    }

    @Override
    public CarRequirement getCarRequirement(BuilderEntity entity) {
        return new BrezzaCarFactory(entity);
    }

}
