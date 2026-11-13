package com.bo.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("充值金额");
        int money = sc.nextInt();
        if (money >= 1000 && money < 2000) {
            money = money + 200;
        } else if (money >= 2000 && money < 3000) {
            money = money + 500;
        } else if (money >= 3000 && money < 5000) {
            money = money + 700;
        } else if (money >= 5000 && money < 10000) {
            money = money + 1300;
        } else if (money >= 10000 && money < 20000) {
            money = money + 2500;
        }else if (money >=20000 && money < 50000) {
            money = money + 6000;
        }else if (money >= 50000)  {
            money = money + 15000;
        }
        System.out.println("卡里余额为" + money);
    }
}
