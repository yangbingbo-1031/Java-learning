package com.heima.test;

public class Litter1 {
    static void main() {
        //定义一个变量用来记录微信余额
        double a = 100;
        //定义一个变量用来记录支付宝余额
        double b = 10;
        //定义一个变量用来记录银行卡余额
        double c = 20;
        //输出现在的余额
        System.out.println(a + b + c);
        //用微信买了5元的饮料和71元的零食
        //又收到红包5元
        a =100-5-71;
        a=a+5;
        System.out.println(a);
    }
}
