package yang;


public class Demo7 {
    public static void main(String[] args) {
        // 1.定义一个数组
        int[] arr = {10, 25, 37, 42, 58, 61, 79};
        // 2.输入一个目标数字
        int target1 = 42;
        int target2 = 99;
        // 3.调用方法
        int index1 = search(arr, target1);
        int index2 = search(arr, target2);
        if (index1 == -1) {
            System.out.println("目标数字" + target1 + "不在数组中");
        } else {
            System.out.println("目标数字" + target1 + "在数组中，索引为" + index1);
        }
        if (index2 == -1) {
            System.out.println("目标数字" + target2 + "不在数组中");
        } else {
            System.out.println("目标数字" + target2 + "在数组中，索引为" + index2);
        }
    }

    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
