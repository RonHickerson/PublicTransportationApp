package com.company;

import jdk.nashorn.internal.ir.WhileNode;

public class LList {
    //  public int value;
    private Vehicle car;
    private int nodeCount;
    private LList next;

//    public LList() {
//        this.value = 0;
//        this.next = null;
//        nodeCount = 1;
//
//    }

//    public LList(int value) {
//        this.value = value;
//        this.next = null;
//        nodeCount = 1;
//    }

    public LList(Vehicle car) {
        this.car = car;
        this.next = null;
        nodeCount = 1;
    }

//    public LList(int value, LList next) {
//        this.value = value;
//        this.next = next;
//        nodeCount = 1;
//    }

    private LList(Vehicle car, LList next) {
        this.car = car;
        this.next = next;
        nodeCount = 1;
    }

    public LList(int size) {
        car = new Vehicle();
        next = null;
        if (size > 1) {
            next = new LList(size - 1);
        }
    }

//    public boolean add(int num) {
//        LList end = new LList(num);
//        LList temp = this;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//        temp.next = end;
//        nodeCount++;
//        return true;
//    }


    public Vehicle getCar() {
        return car;
    }

    public void setCar(Vehicle car) {
        this.car = car;
    }

    public int getNodeCount() {
        return nodeCount;
    }

    public void setNodeCount(int nodeCount) {
        this.nodeCount = nodeCount;
    }

    public LList getNext() {
        return next;
    }

    public void setNext(LList next) {
        this.next = next;
    }

    public boolean add(Vehicle car) {
        LList end = new LList(car);
        LList temp = this;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = end;
        nodeCount++;
        return true;
    }
//    TODO
//    public int indexOf() {
//        int index = 0;
//
//
//
//    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        LList temp = this;
        while (temp.next != null) {
            sb.append(temp.car).append("-");
            temp = temp.next;
        }
        sb.append(temp.car);
        return sb.toString();

    }

    public int countXOccupants(LList lane, int numOccupants) {
        int count = 0;
        while (lane != null) {
            if (lane.car.getOccupant() == numOccupants) {
                count++;
            }
            lane = lane.next;
        }
        return count;
    }

    public int countColorCars(LList lane, String color) {
        int count = 0;
        while (lane != null) {
            if (lane.car.getColor().equals(color)) {
                count++;
            }
            lane = lane.next;
        }
        return count;
    }

}

