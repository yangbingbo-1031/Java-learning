package yang;

public class Demo2 {
    public static void main(String[] args) {
        // 1.定义一个数组
        int[] arr = {1, 2, 3, 4, 5};
        printArr(arr);

    }// 2.定义一个方法来遍历数组

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }

        }
        System.out.println("]");
    }
}
