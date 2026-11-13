package com.bingbo.yang;

import java.util.Scanner;

public class DEMO4 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // 从键盘台输入一个整数
        System.out.println("请输入一个整数");
        int num1 =sc.nextInt();
        System.out.println(num1);
        // 从键盘台输入第二个整数
        System.out.println("请输入第二个整数");
        int num2 =sc.nextInt();
        System.out.println(num2);
        // 计算两个整数的和
        int result=num1+num2;
        System.out.println("两个整数的和为："+result);
    }
}
