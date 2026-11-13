package qwr;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        // 1.键盘录入一个大于等于2的一个整数
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.println("请输入一个大于等于2的一个整数");
            num = scanner.nextInt();
            if (num >= 2) {
                break;
            } else {
                System.out.println("您输入的整数小于2，请重新输入");
            }
        }
        // 2.判断输入的数字是否为质数
        int count = 0;
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                count++;
                System.out.println("您输入的整数不是质数");
                break;
            }
        }
        if (count == 0) {
            System.out.println("您输入的整数是质数");
        }

    }
}
