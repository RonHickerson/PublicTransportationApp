package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Vehicle {

    public Random rand = new Random();
    public int occupant;
    public ArrayList<String> colors = new ArrayList<>();
    public String color;

    public Vehicle() {

        occupant = rand.nextInt(6) + 1;
        color = randomColorGenerator(colors);
    }

    public Vehicle(int occupant, String color) {
        this.occupant = occupant;
        this.color = color;

    }

    public static String randomColorGenerator(ArrayList<String> colors) {
        Random rand = new Random();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        int rng = rand.nextInt(colors.size());
        return colors.get(rng);
    }

    @Override
    public String toString() {
        return "Occupants: " + occupant + " Color: " + color + "\n";
    }
}

