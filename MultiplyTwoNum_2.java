package Ques;
import java.util.Scanner;
public class MultiplyTwoNum_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 ");
        int x = sc.nextInt();
        System.out.print("Enter num2 ");
        int y = sc.nextInt();

        System.out.println("Multiplication of " + x + " and " + y + " is " + (x*y));
        sc.close();
    }
}
