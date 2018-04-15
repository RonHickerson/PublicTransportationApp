package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        System.out.println();

        Random rand = new Random();

        // Linked List Test
//        LList n1 = new LList(10);
//        LList n2 = new LList(20);
//        LList n3 = new LList(30);
//
//        LList n4 = new LList(n1.value);
//        n4.next = n2;
//        LList n5 = new LList(n2.value);
//        n5.next = n3;
//        LList n6 = new LList(n3.value);
//        n6.next = n1;
//        output1Node("n4", n4);
//        output2Nodes("n4", n4, "n5", n5);
//        output3Nodes("n4", n4, "n5", n5, "n6", n6);
//        System.out.println();
//        output1Node("n1", n1);
//        n1.add(20);
//        output1Node("n1", n1);
//        System.out.println();
//        for (int i = 0; i < 10; i++) {
//            n2.add(i);
//        }
//        output1Node("n2", n2);
//        System.out.println();
//        System.out.println();
//        System.out.println();


        // TODO: Milestone 1
        // Create Cars with occupants in HOV Lane
        int numCars = 10;
        LList hovLane = new LList(new Vehicle());
        addCarToLList(numCars, hovLane);
        output1Node("HOV Lane: \n", hovLane);
        System.out.println();

        // (1) How many cars are in the HOV Lane
        System.out.println("Cars in HOV Lane: " + hovLane.nodeCount);

        // TODO: (2) What are the IDs of cars have only 1 occupant.


        // TODO: (3) How many [C] cars are in the HOV lane? [C] is a user-provided car color.


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

//    public static void addRandomNumToLList(int num, int timesToAdd, LList head) {
//        Random rand = new Random();
//        int randNum = rand.nextInt(num) + 1;
//        for (int i = 0; i < timesToAdd; i++) {
//            head.add(randNum);
//            randNum = rand.nextInt(num) + 1;
//
//        }
//    }

    public static void addCarToLList(int timesToAdd, LList head) {
        for (int i = 0; i < timesToAdd; i++) {
            head.add(new Vehicle());
        }
    }
//      TODO
//    public static int findIndexOfCarsWithXOccupants(LList lane, int numOccupants) {
//        if (lane == null)
//            return lane.index;
//        else if (lane.car.occupant == numOccupants)
//            return  1 + countXOccupants(lane.next, numOccupants);
//        else
//            return countXOccupants(lane.next, numOccupants);
//    }

    public static int countXOccupants(LList lane, int numOccupants) {
        if (lane == null)
            return 0;
        else if (lane.car.occupant == numOccupants)
            return 1 + countXOccupants(lane.next, numOccupants);
        else
            return countXOccupants(lane.next, numOccupants);
    }
}
