package Ques;

import java.util.Scanner;

public class LeapYearOrNot_8 {
    // Write a Java program to determine whether a given year is a leap year or not. A leap year is divisible by 4, but if it is divisible by 100, it must also be divisible by 400 to be a leap year.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
        boolean flag = false;  // man liya it is not a leap year

        if(year % 4 ==0){
            flag = true;
            if(year % 100 ==0){
                if(year % 400 == 0){
                    flag = true;
                }
                else{
                    flag = false;
                }
            }
        }
        else{
            flag = false;
        }
        if(flag == false){
            System.out.println(year+" is not a leap year");
        }
        else{
            System.out.println(year + " is a leap year");
        }
    }
}
