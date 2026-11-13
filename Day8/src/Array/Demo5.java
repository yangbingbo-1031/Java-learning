package Array;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        // 1,定义一个数组
        int arr[] = {12, 13, 14, 15, 16,};
        // 2.键盘录入一个数字
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = scanner.nextInt();
        // 3.判断数组中是否有这个数字
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
                System.out.println(i);
                break;
            }
        }
        if (count == 0) {
            System.out.println("数组中没有这个数字");
        }
    }
}

