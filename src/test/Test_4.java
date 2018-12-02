package test;

public class Test_4 {
    public static void main(String[] args) {
        int a1 = 10;
        int a2 = 11;
        boolean a3 = (a1 % 2) == 0;
        boolean a4 = (a2 % 2) == 0;
        System.out.println("10是偶数?" + a3);
        System.out.println("11是偶数?" + a4);

        int b1 = 12;
        int b2 = 13;
        boolean b3 = (b1 % 2) == 0;
        boolean b4 = (b2 % 2) == 0;
        System.out.println("12是奇数?" + b3);
        System.out.println("13是奇数?" + b4);
    }
}
