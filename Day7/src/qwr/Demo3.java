package qwr;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        //  输入一个正整数n
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.println("请输入一个1到100000之间的正整数");
            n = sc.nextInt();
            if (n < 1 || n > 100000) {
                System.out.println("您输入的整数不在1到100000之间，请重新输入");
            } else {
                break;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0 || i % 10 == 4 || i / 10 % 10 == 4 || i / 100 % 10 == 4
                    || i / 1000 % 10 == 4 || i / 10000 % 10 == 4 || i / 100000 % 10 == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}
