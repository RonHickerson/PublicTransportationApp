package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        System.out.println();

        Random rand = new Random();


        //  Milestone 1
        // Create Cars with o
        LList lane = new LList(10);
//        int maxOccupants = 4;
//        int numCars = 10;
//        LList hovLane = new LList(new Vehicle());
        // addRandomCarToLList(numCars, hovLane, maxOccupants, colors);


        // (1) How many cars are in the HOV Lane
        output1Node("HOV Lane: \n", lane);
        System.out.println();
        System.out.println("Cars in HOV Lane: " + lane.size(lane));


        // (2) What are the IDs of cars have only 1 occupant.
        System.out.println("Ids of cars with 1 occupant: " + lane.idsOfOccupantX(1));


        // (3) How many [C] cars are in the HOV lane? [C] is a user-provided car color.
        System.out.println("Amount of cars with specific color: " + lane.countColorCars("White"));

        // Milestone 2
        LList lane2 = new LList(5);


    }

    public static void output1Node(String s, LList n) {
        System.out.println(s + ":\t" + n);
    }

    public static void output2Nodes(String s1, LList n1, String s2, LList n2) {
        output1Node(s1, n1);
        output1Node(s2, n2);
    }

    public static void output3Nodes(String s1, LList n1, String s2, LList n2, String s3, LList n3) {
        output1Node(s1, n1);
        output1Node(s2, n2);
        output1Node(s3, n3);
    }
}


