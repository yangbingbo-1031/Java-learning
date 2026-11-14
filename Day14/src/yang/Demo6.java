package yang;

public class Demo6 {
    public static void main(String[] args) {
        // 1.定义一个数组
        int[] arr = {22, 11, 35, 9, 48, 26};
        // 2.调用方法
        int max = getMax(arr);
        System.out.println(max);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
