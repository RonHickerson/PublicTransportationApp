package com.company;

public class LList {
    public int value;
    public LList next;

    public LList(int value) {
        this.value = value;
        this.next = null;
    }

    public LList(int value, LList next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        LList temp = this;
        while (temp.next != null) {
            sb.append(temp.value).append("-");
            temp = temp.next;
        }
        sb.append(temp.value);
        return sb.toString();
    }
}

