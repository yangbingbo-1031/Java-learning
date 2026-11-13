package yyyyyyy;

public class Demo1 {
    public static void main(String[] args) {
        // 1.定义一个数组nums
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        // 2.定义一个变量val表示要删除的元素
        int val = 2;
        // 3.定义两个指针slow和fast
        int slow = 0;
        int fast = 0;
        // 4.遍历数组nums，并找出所有不是val的元素
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        // 5.打印数组nums
        for (int i = 0; i < slow; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("有效个数为：" + slow);
    }
}
