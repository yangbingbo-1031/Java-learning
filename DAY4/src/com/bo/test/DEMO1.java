package com.bo.test;

import java.util.Scanner;

public class DEMO1 {
    public static void main(String[] args) {
        // 1.定义一个变量为人的体温
        double myTemp = 39.8;
        // 2.如果超过38度，语句为：体温异常
        if (myTemp > 38) {
            System.out.println("体温异常");
        }


        System.out.println("-----------------");
        // 1.游戏初始人物为200hp
        int hp = 200;
        // 2.收到伤害
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入伤害值：");
        int hurt = sc.nextInt();
        hp = hp - hurt;
        if (hp <= 0) {
            hp = 1;
            System.out.println("当前hp = " + hp);
            // 3.技能回复血量
            System.out.println("请输入回复血量：");
            int recover = sc.nextInt();
            hp = hp + recover;
            if (hp > 200) {
                hp = 200;}
            System.out.println("当前hp = " + hp);
        }
    }
}
