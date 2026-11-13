package Array;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        // 1.创建一个动态化数组
        int arr[] = new int[5];
        // 2.键盘录入五个整数
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入一个整数");
            int num = scanner.nextInt();
            // 3.将录入的整数赋值给数组
            arr[i] = num;
        }
        // 4.遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
