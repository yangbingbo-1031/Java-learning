package aaaa.oop;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student("张三", 18, 1.8, 70);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getHight());
        System.out.println(s1.getWeight());

    }
}
