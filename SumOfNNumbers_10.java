package Ques;

public class SumOfNNumbers_10 {
    public static void main(String[] args) {
        // Write a program using a for loop to calculate the sum of the first N natural numbers.
        int n = 5;
        int sum = 0;  // 1 3 9 
        for(int i = 1; i<=n; i++){
            sum += i;  // sum = sum + i;
        }
        System.out.println(sum);
    }
}
