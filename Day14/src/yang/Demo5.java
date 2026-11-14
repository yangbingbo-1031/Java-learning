package yang;

public class Demo5 {
    public static void main(String[] args) {
        // 1.定义一个数组
        int[] arr = {12, 45, 7, 23, 56, 89, 34, 67, 91, 8};
        // 2.遍历数组
        int sum = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            // 3.求数组中偶数的个数
            if (arr[i] % 2 == 0) {
                count1++;
                // 4.求数组中奇数的个数
            } else {
                count2++;
            }
            // 5.所有元素的总和
            sum += arr[i];
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(sum);
    }
}
