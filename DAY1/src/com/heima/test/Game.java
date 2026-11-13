package com.heima.test;

public class Game {
   public static void main(String[] args) {
        //定义一个变量记录我方的攻击力
        int attack1=220;
        //定义一个变量记录敌方的攻击力
        int tattack2=210;
        //定义一个变量记录我方的血量
        double blood1=1012.5;
        //定义一个变量记录敌方的血量
        double blood2=1223.3;
//      记录一个变量记录我方防御力
        int defence1=85;
        //定义一个变量记录敌方防御力
        int defence2=80;
        //定义一个变量记录我方技能加成
        double skill1=1.2;
        //定义一个变量记录敌方技能加成
        double skill2=1.3;
        //普攻伤害公式是：攻击力-防御力
        //我方第一次普攻造成的伤害
        double damage1=attack1-defence2;
        // 敌方剩余血量
        blood2=blood2-damage1;
        System.out.println(blood2);
        //敌方第一次普攻造成的伤害
        double damage2=tattack2-defence1;
        //我方剩余血量
        blood1=blood1-damage2;
        System.out.println(blood1);
        //技能造成伤害公式是：攻击力*技能加成-防御力*技能加成
        //我方第二次技能造成的伤害
        double damage3=attack1*skill1-defence2*skill2;
        // 敌方剩余血量
        blood2=blood2-damage3;
        System.out.println(blood2);
        //敌方第二次技能造成的伤害
        double damage4=tattack2*skill2-defence1*skill1;
        //我方剩余血量
        blood1=blood1-damage4;
        System.out.println(blood1);
    }
}
