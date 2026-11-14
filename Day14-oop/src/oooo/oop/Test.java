package oooo.oop;

public class Test {
    public static void main(String[] args) {
        // 1.创建学生对象
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);
        s.setHight(1.83);
        s.setWeight(60);
        s.study();
        // 2.大一时的属性
        System.out.println(s.getName() + " , " + s.getAge() + " , " + s.getHight() + " , " + s.getWeight());
        // 3.大二体重增加10kg
        s.setAge(s.getAge() + 1);
        double num = s.getWeight() + 10;
        s.setWeight(num);
        System.out.println(s.getName() + " , " + s.getAge() + " , " + s.getHight() + " , " + s.getWeight());
        // 4.大三体重减少3kg，身高增加0.02m
        s.setAge(s.getAge() + 1);
        double num2 = s.getWeight() - 3;
        s.setWeight(num2);
        double num3 = s.getHight() + 0.02;
        s.setHight(num3);
        System.out.println(s.getName() + " , " + s.getAge() + " , " + s.getHight() + " , " + s.getWeight());
        // 5.大四时的属性
        s.setAge(s.getAge() + 1);
        System.out.println(s.getName() + " , " + s.getAge() + " , " + s.getHight() + " , " + s.getWeight());
        // 6.毕业时的属性
        s.setAge(s.getAge() + 1);
        System.out.println(s.getName() + " , " + s.getAge() + " , " + s.getHight() + " , " + s.getWeight());
    }
}
