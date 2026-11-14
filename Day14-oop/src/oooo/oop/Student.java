package oooo.oop;

import java.sql.SQLOutput;

public class Student {
    // 1.属性
    private String name;
    private int age;
    private double hight;
    private double weight;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void study() {
        System.out.println(name + "正在学习");
    }
}
