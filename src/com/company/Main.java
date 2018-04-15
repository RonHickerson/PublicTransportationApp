package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World");
        System.out.println();

        // Linked List Test
        LList n1 = new LList(10);
        LList n2 = new LList(20);
        LList n3 = new LList(30);

        LList n4 = new LList(n1.value);
        n4.next = n2;
        LList n5 = new LList(n2.value);
        n5.next = n3;
        LList n6 = new LList(n3.value);
        n6.next = n1;
        output1Node("n4", n4);
        output2Nodes("n4", n4, "n5", n5);
        output3Nodes("n4", n4, "n5", n5, "n6", n6);
        System.out.println();
        System.out.println();

        // TODO: Milestone 1




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
