package yyyyyy;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        // 1.定义一个动态数组
        int[] arr = new int[5];
        // 2.键盘录入五个0-100的整数存入到数组中
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个整数");
            int num = sc.nextInt();
            if (num < 0 || num > 100) {
                System.out.println("请重新录入整数");
                i--;
                continue;
            }
            arr[i] = num;
        }
        int max = getMax(arr);
        System.out.println("数组的最大值为：" + max);
        int min = getMin(arr);
        System.out.println("数组的最小值为：" + min);
        int sum = sum(arr);
        System.out.println("数组的总和为：" + sum);
        // 6.求数组的平均值
        double avg = (sum - max - min) / (arr.length - 2.0);
        System.out.println("数组的平均值为：" + avg);
    }

    // 3.定义一个方法求数组的最大值
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // 4.定义一个方法求数组的最小值
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    // 5.定义一个方法求数组总和
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
