package Ques;
import java.util.Scanner;
public class GoodMorning_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User please tell me your name : ");
        String name = sc.next();
        System.out.println("Good Morning "+name+"!");
        sc.close();
    }
}
