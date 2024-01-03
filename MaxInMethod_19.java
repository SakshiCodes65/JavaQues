package Ques;

public class MaxInMethod_19 {
    static void max(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else if (c > a && c > b) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        int a = 45, b = 54, c = 345;
        max(a, b, c);
        max(3,4,5);
        max(34,56,12);
    }
}
