package Array;

public class Demo2 {
    public static void main(String[] args) {
        // 1.创建一个数组
        int arr[] = {1,2,2,12,2};
        // 2.获取数组中的元素
        int nuum = arr [3];
        System.out.println(nuum);
        System.out.println(arr[3]);
        // 3.修改数组中的元素
        arr [3] = 10000;
        System.out.println(arr[3]);

    }
}
