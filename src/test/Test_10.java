package test;

public class Test_10 {
    public static void main(String[] args) {
        jiaFa();
        jianFa();
        chengFa();
        chuFa();
        quYu();
    }

    public static void jiaFa() {
        int x = 100;
        int y = 200;
        int add = x + y;
        System.out.println("x,y的和为:" + add);
    }

    public static void jianFa() {
        int x = 100;
        int y = 200;
        int sub = x - y;
        System.out.println("x,y的差为:" + sub);
    }

    public static void chengFa() {
        int x = 100;
        int y = 200;
        int mul = x * y;
        System.out.println("x,y的积为:" + mul);
    }

    public static void chuFa() {
        int x = 100;
        int y = 200;
        int div = x / y;
        System.out.println("x,y的商为:" + div);
    }

    public static void quYu() {
        int x = 100;
        int y = 200;
        int remain = x % y;
        System.out.println("x,y的余为:" + remain);
    }
}
