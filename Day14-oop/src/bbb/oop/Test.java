package bbb.oop;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "张三";
        t1.age = 30;
        System.out.println(t1.name);
        System.out.println(t1.age);
        t1.teach();
        t1.sleep();
        t1.eat();
    }
}
