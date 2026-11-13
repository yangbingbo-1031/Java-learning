package com.test.co;

// 导入Scanner（必须加！不然IDEA不认识Scanner类）
import java.util.Scanner;

public class Test {
    // ✅ psvm标准签名：补了public和String[] args
    public static void main(String[] args) {
        // 1. 生成7位随机彩票号码（1000000~9999999）
        int randomNumber = (int) (Math.random() * 9000000 + 1000000);
        System.out.println("本次随机号码：" + randomNumber);

        // 2. 键盘录入用户猜的号码（✅ 用Scanner，IDEA里100%能用！）
        Scanner sc = new Scanner(System.in); // 创建"键盘扫描仪"
        System.out.print("请输入你猜的7位号码：");
        int inputNumber = sc.nextInt(); // 读一个整数（直接读int，不用转！）

        // 3. 判断是否猜对
        if (inputNumber == randomNumber) {
            System.out.println("🎉 恭喜你猜对了！");
        } else {
            System.out.println("😢 很遗憾，你猜错了！正确号码是：" + randomNumber);
        }
    }
}