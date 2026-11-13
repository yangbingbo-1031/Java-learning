package qwr;

import java.lang.classfile.attribute.SourceDebugExtensionAttribute;

public class Demo6 {
    public static void main(String[] args) {
        int space = 2;
        int star = 3;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            space--;
            star+=2;
            System.out.println();
        }
    }
}