package com.bbb.test;

public class DEMO1 {
    static void main(String[] args) {
        System.out.println("hello world");
            int a = 200;
            byte b = 32;
            short c = 45;
            double d = 2.1;
            // 1.byte和short在运算时会自动升级为int类型
            int num = b + c;
            System.out.println(num);
            // 2.int和double在运算时会自动升级为double类型
            double num2 = a + d;
            System.out.println(num2);
            // 3.b + c + d 的转换的过程是 b + c 变成int，再和d相加，变成double类型
            double num3 = b + c + d;
            System.out.println(num3);
            System.out.println("-----------------");

            // 4.注意，强制转换时，会丢失精度，结果不准确
            short x = 123;
            short y = 32;
            byte  z = (byte)(x + y);
            System.out.println(z);
    }
}
