package Array;

import java.util.Random;

public class Demo8 {
    public static void main(String[] args) {
        // 1.创建一个动态化数组
        int arr[] = new int[10];
        // 2.获取十个随机数
        Random r = new Random();
        for (int i = 0; i < arr.length; ) {
            int num = r.nextInt(100) + 1;
            // 3.将随机数存入给数组
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (num == arr[j]) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                arr[i] = num;
                i++;
            }
        }
        // 4.遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
