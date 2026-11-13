package com.yyyy;

import java.util.Scanner;

public class Demo1 {
   public static void main(String[] args) {
        // 录入一个数字代表星期
       Scanner sc = new Scanner(System.in);
       System.out.println( "请输入一个数字代表星期");
       int week = sc.nextInt();
      String result = switch (week){
           case 1,2,3,4,5 ->  "工作日,起来肝代码";
           case 6,7 -> "周末，睡到自然醒";
           default ->  "输入错误，一周只有七天";
       };
       System.out.println(result);
    }
}
