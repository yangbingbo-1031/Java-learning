package com.bbb.test;

import java.util.Scanner;

public class TestOperator4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int a = scanner.nextInt();
        System.out.println("请输入第二个整数");
        int b = scanner.nextInt();
        System.out.println(a > b ? "第一个整数大" : (a < b ? "第二个整数大" : "两个整数一样大"));


    }
}
