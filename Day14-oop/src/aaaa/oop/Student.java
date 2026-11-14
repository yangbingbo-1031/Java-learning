package aaaa.oop;

public class Student {
    // 1.属性
    private String name;
    private int age;
    private double hight;
    private double weight;

    // 2.空参构造方法和有参构造方法
    public Student() {
    }

    public Student(String name, int age, double hight, double weight) {
        this.name = name;
        this.age = age;
        this.hight = hight;
        this.weight = weight;
    }

    // 3.set和get方法
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
}
