package Demo;

public class Demo_2 {
    public static void main(String[] args) {
        int i = 100;
        int j = 20;
        int k = 2000;

        int max = (i > j) ? i : j;
        max = (max > k) ? max : k;
        System.out.println(max);
    }
}
