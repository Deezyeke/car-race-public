package com.codecool.car_race.vehicles;

import com.codecool.car_race.GenerateRandom;
import com.codecool.car_race.Race;

public class Car extends Vehicle{
    private final int normalSpeed;
    private static final String[] carNames = {"Raven", "Scout", "Resolve", "Epitome", "Mystery",
            "Quest", "Icon", "Voyage", "Expedition", "Tarragon"};
    private final static int YELLOW_FLAG_SPEED = 75;

    public Car() {
        this.name = carNames[GenerateRandom.generateRandom(0,9)] + " " + carNames[GenerateRandom.generateRandom(0,9)];
        this.normalSpeed = GenerateRandom.generateRandom(80, 110);
    }

    @Override
    public void prepareForLap(Race race) {
        if (race.isYellowFlagActive()) {
            actualSpeed = YELLOW_FLAG_SPEED;
        } else {actualSpeed = normalSpeed;}
    }

    @Override
    public void moveForAnHour() {
        distanceTravelled += actualSpeed;
    }
}
