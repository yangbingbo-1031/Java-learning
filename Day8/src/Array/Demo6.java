package Array;

public class Demo6 {
    public static void main(String[] args) {
        //1.定义一个数组
        int arr[] = {12, 15, 16, 15, 18, 10, 12, 122};
        //定义一个最小值
        int min = arr[0];
        //2.遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
