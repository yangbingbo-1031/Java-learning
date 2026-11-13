package yyyyyy;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        // 1. 定义一个动态数组
        int[] arr = new int[10];
        // 2.键盘录入十位学生成绩0-100的整数存入到数组中
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个整数");
            int num = sc.nextInt();
            if (num < 0 || num > 100) {
                System.out.println("成绩无效，请重新录入");
                i--;
                continue;
            }
            arr[i] = num;
        }
        int passCount = getPassCount(arr);
        System.out.println("及格人数为：" + passCount);
        double passRate = (double) passCount / (arr.length);
        System.out.println("及格率为：" + passRate);
        int sum = getSum(arr);
        System.out.println("总分为：" + sum);
        double avg = (double) sum / (arr.length);
        System.out.println("平均分为：" + avg);
        int max = getMax(arr);
        System.out.println("最大分为：" + max);
    }

    // 3.定义一个方法求及格人数和及格率
    public static int getPassCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 60) {
                count++;
            }
        }
        return count;
    }

    // 4.定义一个方法求总分
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // 5.定义一个方法求最大值
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
