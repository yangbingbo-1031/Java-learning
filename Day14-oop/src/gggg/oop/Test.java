package gggg.oop;

public class Test {
    public static void main(String[] args) {
        // 1.创建对象1
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(18);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        s1.study();
        s1.eat();
        s1.sleep();
        // 2.创建对象2
        Student s2 = new Student("李四", 20);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        s2.study();
        s2.eat();
        s2.sleep();
    }
}
