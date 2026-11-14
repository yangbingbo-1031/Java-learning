package yang;

public class Demo4 {
    public static void main(String[] args) {
        // 1.定义一个数组
        int[] arr = {3, 1, 4, 2};
        int start = 0;
        int end = arr.length - 1;
        // 2.遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (start < end) {
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
            }
            start++;
            end--;
            if (start >= end) {
                break;
            }
        }
        // 3.输出排序后的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
