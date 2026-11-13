package qwr;
public class Demo9 {
    public static void main(String[] args) {
        int space = 2;
        int midSpace = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (midSpace > 0) {
                for (int j = 1; j < midSpace; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
            space--;
            midSpace += 2;
        }
        space = space + 2;
        midSpace = midSpace - 4;
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (midSpace > 0) {
                for (int j = 1; j < midSpace; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
            space++;
            midSpace -= 2;
        }
    }
}