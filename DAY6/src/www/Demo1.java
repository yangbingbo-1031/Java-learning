package www;

public class Demo1 {
    public static void main(String[] args) {
        // 1.定义一个变量为我存十万本金
        double money = 100000;
        double expectmoney = 200000;
        int year = 0;
        while (money < expectmoney) {
            money = money + money * 0.017;
            year++;
        }
        System.out.println(year);
    }
}
