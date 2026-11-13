package com.bingbo.yang;

public class BMIDEMO2 {
    static void main(String[] args) {
        // 定义一个变量记录我的身高
        double height=1.75;
        // 定义一个变量记录我的BMI
        double bmi=23.9;
        //体重=BMI*身高^平方
        double weight=bmi*height*height;
        System.out.println(weight);}
}
