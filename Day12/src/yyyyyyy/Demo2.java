package yyyyyyy;

import java.util.Random;

public class Demo2 {
    public static void main(String[] args) {
        // 1.定义一个金额表示红包
        int money = 20000;
        // 2.定义一个变量num表示红包的人数
        int num = 5;
        if (money < num) {
            System.out.println("金额不足,不能发红包");
        } else {
            System.out.println("金额充足,可以发红包");
            Random random = new Random();
            for (int i = 1; i < num; i++) {
                int monei = random.nextInt(money - (num - i)) + 1;
                money -= monei;
                System.out.println("第" + i + "个人获得" + monei + "分");
            }
            System.out.println("第" + num + "个人获得" + money + "分");
        }
    }
}
