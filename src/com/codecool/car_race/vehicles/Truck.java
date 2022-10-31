package com.codecool.car_race.vehicles;

import com.codecool.car_race.GenerateRandom;

public class Truck extends Vehicle{

    public Truck() {
        this.name = String.valueOf(GenerateRandom.generateRandom(0, 1000));
    }

    @Override
    public void prepareForLap(boolean isDisadvantage) {
        if (isDisadvantage) {
            actualSpeed = 0;
        } else {
            actualSpeed = 100;}
    }

    @Override
    public void moveForAnHour() {
        distanceTraveled = actualSpeed * 60;
    }
}
