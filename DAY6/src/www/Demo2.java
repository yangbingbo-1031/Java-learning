package www;

public class Demo2 {
   public static void main(String[] args) {
        // 定义一个变量为纸张厚度
        double paper = 0.1;
        // 珠穆朗玛峰的高度为8848860
        double height = 8848860;
        int count = 0;
        while (paper < height) {
            paper = paper * 2;
            count++;
        }
        System.out.println(count);
    }
}
