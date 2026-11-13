package com.bingbo.yang;

import java.util.Scanner;

public class DEMO6 {
    static void main(String[] args) {
        int a = 12;
        int b = 355;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println("-----------------");


        //输入一个四位数的整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位数的整数");
        int num = sc.nextInt();
        System.out.println(num);
        //拆分该数的个位
        int ge = num % 10;
        System.out.println(ge);
        //拆分该数的十位
        int shi = num / 10 % 10;
        System.out.println(shi);
        //拆分该数的百位
        int bai = num /100 % 10;
        System.out.println(bai);
        //拆分该数的千位
        int qian = num /1000 % 10;
        System.out.println(qian);
    }
}
