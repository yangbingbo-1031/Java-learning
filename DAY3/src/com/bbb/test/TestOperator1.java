package com.bbb.test;

public class TestOperator1 {
    static void main(String[] args) {
        int x = 5;
        int y = x++;
        int z = ++x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("-----------------");
        int A = 5;
        int B = ++A;
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}
