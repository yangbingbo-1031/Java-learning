package qwr;

import java.util.Random;

public class Demo4 {
   public static void main(String[] args) {
       Random random = new Random();
       for (int i = 1; i < 100; i++) {
           int num = random.nextInt(11);
           System.out.println(num);
       }
    }
}
