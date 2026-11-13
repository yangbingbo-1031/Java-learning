package yang;

public class Demo3 {
    public static void main(String[] args) {
        printMultTable(null);

    }
    // 1.定义一个方法

    public static void printMultTable(int[] arr) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}