package Ques;

public class Factorial_11 {
    public static void main(String[] args) {
        int n = 6;
        int i = 1;
        int fact = 1;
        while(i<n){
            fact *= i; // fact = fact * i;
            i++;
        }
        System.out.println(fact);
    }
}
