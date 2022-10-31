package com.codecool.car_race;

public class GenerateRandom {
    public static int generateRandom(int min, int max) {
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }
}
