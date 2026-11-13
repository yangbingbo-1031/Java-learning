package qwr;

public class Demo10 {
    public static void main(String[] args) {
        // 打印一个直角三角形
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
