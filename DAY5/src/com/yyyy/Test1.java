package com.yyyy;

public class Test1 {
    public static void main(String[] args) {
        // 定义一个变量为sum，用于存储1-5的和
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }
        System.out.println("1-5的和为：" + sum);
    }
}