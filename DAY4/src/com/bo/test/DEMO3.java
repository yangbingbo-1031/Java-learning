package com.bo.test;

import java.util.Scanner;

public class DEMO3 {
   public static void main(String[] args) {
        // 1.小明买了一顿烧烤花了50元
        // 2.饿了么app：全场九折优惠
        // 3.美图app：满50-10优惠
        // 4.哪家更划算
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入烧烤价格：");
        double price = sc.nextDouble();
        double price1 = price * 0.9;
        double price2 = 0;
        System.out.println("饿了么app价格为：" + price1);
        if (price >= 50){
            price2 = price - 10;
        }
       System.out.println("美图app价格为：" + price2);
        if (price1>price2){
            System.out.println("美图app更划算");
        } else {
            System.out.println("饿了么app更划算");
        }
    }
}
