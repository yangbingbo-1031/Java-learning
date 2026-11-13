package yyyyyy;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        // 1.定义一个动态数组，记录五名候选人和弃权
        int[] arr = new int[6];
        Random random = new Random();
        // 2.模拟投票
        for (int i = 0; i < 1000; i++) {
            int vote = random.nextInt(6);
            arr[vote]++;
        }
        // 3.统计候选人得票数和得票率
        for (int i = 1; i < arr.length; i++) {
            System.out.println("候选人" + i + "的投票数为：" + arr[i] + "，得票率为：" + (arr[i] / 1000.0 * 100) + "%");
        }
        // 4.统计最大投票数
        int max = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // 5.统计最大投票数的候选人
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == max) {
                System.out.println("最大投票数的候选人为：" + i + "，最多投票数为：" + max);
            }
        }
        // 6.统计弃权数
        System.out.println("弃权数为：" + arr[0]);
        // 7.统计弃权率
        System.out.println("弃权率为：" + (arr[0] / 1000.0 * 100) + "%");
    }
}
