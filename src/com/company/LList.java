package com.company;

public class LList {
    public int value;
    public LList next;

    public LList(int value, LList next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return value + " ";
    }
}
