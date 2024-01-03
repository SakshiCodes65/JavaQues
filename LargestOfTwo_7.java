package Ques;
import java.util.Scanner;
public class LargestOfTwo_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num1: ");
        int num2 = sc.nextInt();
        sc.close();

        if(num1>num2){
            System.out.println(num1+" is greater than "+num2);
        }
        else{
            System.out.println(num2+" is greater than "+num1);
        }
    }
}
