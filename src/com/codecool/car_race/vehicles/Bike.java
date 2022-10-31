package com.codecool.car_race.vehicles;

import com.codecool.car_race.GenerateRandom;

public class Bike extends Vehicle{

    public Bike(int number) {
        this.name = "Motorcycle " + number;
    }

    @Override
    public void prepareForLap(boolean isDisadvantage) {
        if (isDisadvantage) {
            actualSpeed = GenerateRandom.generateRandom(5, 50);
        } else {
            actualSpeed = 100;}
    }

    @Override
    public void moveForAnHour() {
        distanceTraveled = actualSpeed * 60;
    }
}
