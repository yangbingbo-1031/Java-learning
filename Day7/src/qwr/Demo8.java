package qwr;

public class Demo8 {
    public static void main(String[] args) {
        int space1 = 3;
        int star1 = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= space1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star1; j++) {
                System.out.print("*");
            }
            System.out.println();
            space1 --;
            star1 += 2;
        }
        int space2 = 1;
        int star2 = 5;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= space2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star2; j++) {
                System.out.print("*");
            }
            System.out.println();
            space2 ++;
            star2 -= 2;
        }
    }
}
