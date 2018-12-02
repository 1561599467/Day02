package test;

public class Test_6 {
    public static void main(String[] args) {
        printNum();
    }

    public static void printNum() {
        int a = 9;
        int b = 9;

        int num = ++a;
        boolean bo = (num >= 10) ? true : false;
        System.out.println("boх─ох" + bo);

        int num2 = b++;
        boolean bo2 = (num2 >= 10) ? true : false;
        System.out.println("bo2х─ох" + bo2);

    }
}
