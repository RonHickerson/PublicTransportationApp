package com.company;


import java.util.Random;

public class Vehicle {

    private int occupant;
    private String color;
    private int id;
    private Random rand = new Random();

    public Vehicle() {
        id = rand.nextInt(10) + 1;
        occupant = rand.nextInt(8) + 1;
        color = "White";
    }

    public Vehicle(int id, int occupant, String color) {
        this.id = id;
        this.occupant = occupant;
        this.color = color;
    }


    public int getOccupant() {
        return occupant;
    }

    public String getColor() {
        return color;
    }

    public void setOccupant(int occupant) {
        this.occupant = occupant;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Vehicle(int occupant, String color) {
        this.occupant = occupant;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Occupants: " + occupant + " Color: " + color + " ID: " + id + "\n";
    }
}

