package com.codecool.car_race.vehicles;

import com.codecool.car_race.GenerateRandom;

public class Car extends Vehicle{
    private final int normalSpeed;

    public Car() {
        this.normalSpeed = GenerateRandom.generateRandom(80, 110);
    }

    @Override
    public void prepareForLap(boolean isDisadvantage) {
        if (isDisadvantage) {
            actualSpeed = 75;
        } else {actualSpeed = normalSpeed;}
    }

    @Override
    public void moveForAnHour() {
        distanceTraveled = actualSpeed * 60;
    }
}
