package com.yyyy;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        // 输入一个正整数，代表循环范围
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("输入错误，必须输入正整数");
        }
        // 定义一个求和变量
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum - i;
            } else {
                sum = sum + i;
            }
        }
        // 打印当前的sum值
        System.out.println(sum);
    }
}