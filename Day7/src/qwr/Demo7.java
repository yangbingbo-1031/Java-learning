package qwr;

public class Demo7 {
    public static void main(String[] args) {
        int space = 2;
        int star = 6;
        for (int j = 1; j <= 3; j++) {
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= star; i++) {
                System.out.print("*");
            }
            space--;
            System.out.println();
        }
    }
}