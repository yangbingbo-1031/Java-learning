package com.bbb.test;

public class TestOperator3 {
   public static void main(String[] args) {
       int a = 10;
       int b = 20;
       // 1.使用&&
       boolean result = a > 15 && ++a > 10;
       System.out.println(result);

       // 2.使用||
       boolean result2 = b > 15 || ++b > 20;
       System.out.println(result2);

       System.out.println("a = " + a);
       System.out.println("b = " + b);

    }
}
