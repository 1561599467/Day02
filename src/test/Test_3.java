package test;

public class Test_3 {
    public static void main(String[] args) {
        char ch = 'J';
        //J--74,j--106
        ch = (char) (ch + 32);
        System.out.println(ch);

        char ch2 = 'a';
        ch2 -= 32;
        System.out.println(ch2);

        double d3 = 3.5;
        int i3 = 100;
        double sum3 = d3 + i3;

        System.out.println("sum3的值:" + sum3);
        System.out.println("sum3的整数部分的值:" + (int) sum3);

        double d4 = 17.4;
        int i4 = 100;
        int mul4 = (int) (d4 * i4);
        System.out.println("mul4的整数部分的值:" + mul4);
        System.out.println(d4 * 1);

    }
}
