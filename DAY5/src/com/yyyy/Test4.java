package com.yyyy;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        // 1.键盘录入两个数字，代表一个范围
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int num2 = sc.nextInt();
        // 2.判断两个数字的大小关系
        int max = num1 > num2 ? num1 : num2;
        int min = num1 < num2 ? num1 : num2;
        // 3.遍历范围内的所有数字
        int count = 0;
        for (int i = min; i <= max; i++) {
            if (i % 6 == 0 && i % 8 == 0) {
                count++;
            }
        }
        // 4.判断结果
        if (count == 0) {
            System.out.println("在" + min + "到" + max + "之间没有符合条件的数字");
        } else {
            System.out.println("在" + min + "到" + max + "之间有" + count + "个");
        }
    }
}
