package gggg.oop;

public class Student {
    // 1.属性
    private String name;
    private int age;

    // 2.空参构造方法和有参构造方法---快捷键alt+insert
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 3.set和get方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void study() {
        System.out.println(name + "我在学习");
    }

    public void eat() {
        System.out.println(name + "我在吃饭");
    }

    public void sleep() {
        System.out.println(name + "我在睡觉");
    }

}
