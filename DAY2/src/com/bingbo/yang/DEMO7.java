package com.bingbo.yang;

public class DEMO7 {
    public static void main(String[] args) {
        //定义一个变量秒数
        int second = 3661;
        //转换成小时
        int hour = second /3600;

        //转换成分钟
        int min = second % 3600 / 60;

        //转换成秒
        int sec = second % 3600 % 60;

        System.out.println(hour +"  "+ min +"  " + sec);
    }
}
