package com.yyyy;

public class Test2 {
    public static void main(String[] args) {
        // 定义一个变量为偶数和
        int sum1 = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum1 = sum1 + i;
        }
        System.out.println("1-100的偶数和为：" + sum1);


        System.out.println("-------------------------");
        // 继续定义一个变量
        int sum2 = 0;
        for (int h = 1; h <= 100; h++) {
            if (h % 2 == 0) {
                sum2 = sum2 + h;
            }
        }
        System.out.println("1-100的偶数和为：" + sum2);
    }
}