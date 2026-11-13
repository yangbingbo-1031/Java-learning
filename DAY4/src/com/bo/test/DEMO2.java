package com.bo.test;

public class DEMO2 {
   public static void main(String[] args) {
       // 1.定义一个数表示学生期末成绩
       double score = 200;
       // 2.判断成绩是否合理
       if(score >=0 && score <=100) {
           if (score >= 60) {
               System.out.println("通过");
           } else {
               System.out.println("不通过");
           }
       } else{
           System.out.println("成绩不合理");}
    }
}
