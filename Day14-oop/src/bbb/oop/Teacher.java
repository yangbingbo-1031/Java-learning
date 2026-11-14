package bbb.oop;

public class Teacher {
    // 属性
    String name;
    int age;

    //行为
    public void teach() {
        System.out.println("我是" + name + "，我正在教学");
    }

    public void sleep() {
        System.out.println("我是" + name + "，我正在睡觉");
    }

    public void eat() {
        System.out.println("我是" + name + "，我正在吃");
    }
}
