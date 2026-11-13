package yyyyyy;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight;  // ← 问题1修复：声明放循环外

        // 1. 输入重量并校验
        while (true) {
            System.out.println("请输入快递的重量");
            weight = sc.nextDouble();
            if (weight > 0) {
                break;
            }
            System.out.println("重量无效，请重新录入");
        }

        // 2. 向上取整（不足1kg按1kg算）
        int w = (int) Math.ceil(weight);
        System.out.println("实际计费重量：" + w + "kg");

        // 3. 调用方法计算费用
        double price = calcPrice(w);
        System.out.println("快递费用为：" + price + "元");
    }

    // 4. 单独定义一个计算快递费的方法（题目要求2）
    public static double calcPrice(int w) {
        if (w <= 1) {
            return 10;                   // 首重1kg：10元
        } else if (w <= 5) {
            return 10 + (w - 1) * 2;     // 超出1-5kg：每kg加2元
        } else {
            return 10 + 4 * 2 + (w - 5) * 1.5;  // 超出5kg以上：每kg加1.5元
        }
    }
}
