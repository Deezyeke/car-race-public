package com.codecool.car_race.vehicles;

import com.codecool.car_race.GenerateRandom;
import com.codecool.car_race.Race;

public class Bike extends Vehicle{

    public Bike(int number) {
        this.name = "Motorcycle " + number;
    }

    @Override
    public void prepareForLap(Race race) {
        actualSpeed = 100;
        if (race.isRaining()) {
            actualSpeed -= GenerateRandom.generateRandom(5, 50);
        }
    }

    @Override
    public void moveForAnHour() {
        distanceTraveled += actualSpeed;
    }
}
