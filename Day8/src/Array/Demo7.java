package Array;

import java.util.Random;

public class Demo7 {
    public static void main(String[] args) {
        // 1.定义一个数组
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[num];
            arr[num] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
