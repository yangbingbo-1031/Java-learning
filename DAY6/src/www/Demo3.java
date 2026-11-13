package www;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        // 输入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        // 如果输入的数为负数，先取绝对值
        if (num < 0) {
            num = -num;
        }
        // 定义一个变量为每一位的数字的和
        int sum = 0;
        // 获取每一位的数字
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
