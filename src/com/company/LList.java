package com.company;

public class LList {
    //  public int value;
    public Vehicle car;
    public int nodeCount;
    public LList next;

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

    public LList(Vehicle car, LList next) {
        this.car = car;
        this.next = next;
        nodeCount = 1;
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

}

