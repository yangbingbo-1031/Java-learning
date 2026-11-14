package yang;

public class Demo3 {
    public static void main(String[] args) {
        // 1.定义一个数组
        int[] arr = {1, 3, 5, 7, 9, 11};
        // 2.遍历数组
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 3.比较相邻元素的大小
                if (arr[j] < arr[j + 1]) {
                    // 4.交换相邻元素的位置
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // 5.输出排序后的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
