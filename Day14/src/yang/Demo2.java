package yang;

public class Demo2 {
    public static void main(String[] args) {
        // 1.定义一个数组
        int[] arr = {5, 2, 3, 1};
        // 2.冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // 3.遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
