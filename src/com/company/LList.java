package com.company;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.ArrayList;

public class LList {
    //  public int value;
    private Vehicle car;
    private LList next;

    public LList() {
        this.next = null;
        this.car = new Vehicle();
    }



    public LList(Vehicle car) {
        this.car = car;
        this.next = null;
    }


    public LList(Vehicle car, LList next) {
        this.car = car;
        this.next = next;
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

    public int countXOccupants(int numOccupants) {
        LList temp = this;
        int count = 0;
        while (temp != null) {
            if (temp.car.getOccupant() == numOccupants) {
                count++;
            }
            temp = temp.next;
        }
        return count;
    }

    public ArrayList<Integer> idsOfOccupantX(int numOccupants) {
        LList temp = this;
        ArrayList<Integer> ids = new ArrayList<>();
        while (temp != null) {
            if (temp.car.getOccupant() == numOccupants) {
                ids.add(temp.car.getId());
            }
            temp = temp.next;
        }
        return ids;
    }

    public int countColorCars(String color) {
        int count = 0;
        LList temp = this;
        while (temp != null) {
            if (temp.car.getColor().equals(color)) {
                count++;
            }
            temp = temp.next;
        }
        return count;
    }

    public int size(LList head) {
        if (head == null) {
            return 0;
        } else
            return 1 + size(head.next);
    }

}

