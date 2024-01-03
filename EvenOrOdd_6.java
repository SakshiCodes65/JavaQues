package Ques;
import java.util.Scanner;
public class EvenOrOdd_6{
    public static void main(String[] args) {
        // Write a Java program that takes an integer as input and checks if it is even or odd. Display an appropriate message based on the result.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if(num % 2 == 0){
            System.out.println(num + " is Even number");
        }
        else{
            System.out.println(num+ " is Odd number");
        }
    }
}