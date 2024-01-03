package Ques;

import java.util.Scanner;

public class CheckPalindromeString_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // mom , madam --> palindome
        // star , rest --> non palindrome
        
        String name = sc.next();
        int length = name.length();
        sc.close();
        for(int i = 0 ; i<length/2 ; i++){
            if(name.charAt(i) != name.charAt(length - i -1)){
                System.out.println("Not Palindrom");
                return;
            }
        }
        System.out.println("Palindrome");
        
    }
}
