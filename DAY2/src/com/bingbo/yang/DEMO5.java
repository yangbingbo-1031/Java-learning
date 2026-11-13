package com.bingbo.yang;

import java.util.Scanner;

public class DEMO5 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //输入体重
        System.out.println("请输入您的体重");
        double weight=sc.nextDouble();
        //输入身高
        System.out.println("请输入您的身高");
        double height=sc.nextDouble();
        //计算BMI
        double bmi=weight/height/height;
        System.out.println("您的BMI值为："+bmi);}
}
