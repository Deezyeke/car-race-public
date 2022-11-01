package com.codecool.car_race;

import com.codecool.car_race.vehicles.Truck;
import com.codecool.car_race.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private boolean isRaining;

    private List<Vehicle> vehicles = new ArrayList<>();

    public boolean isRaining() {
        return isRaining;
    }

    public void registerRacers(Vehicle ... vehicles) {
        this.vehicles.addAll(List.of(vehicles));
    }

    /**
     * Simulates the passing of time by advancing the weather and
     * moving the vehicles for the duration of a whole race.
     */
    public void simulateRace(int laps) {
        for (int i = 0; i < laps; i++) {
            for (Vehicle vehicle : vehicles) {
                vehicle.prepareForLap(this);
                vehicle.moveForAnHour();
            }
            advance();
        }
    }

    /**
     * Prints the state of all vehicles. Called at the end of the
     * race.
     */
    public void printRaceResults() {
        System.out.println("Race results:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }

    public void advance() {
        int rainingChance = GenerateRandom.generateRandom(0, 10);
        isRaining = rainingChance < 3;
    }

    public boolean isYellowFlagActive() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Truck truck) {
                if (truck.isBroken()) {
                    return true;
                }
            }
        }
        return false;
    }
}
