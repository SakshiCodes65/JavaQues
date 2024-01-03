package Ques;

import java.util.Scanner;

public class Grades_9 {
//     Develop a simple grading system program. Take a student's score as input, and based on the score, print a grade using the following criteria:

// 90 and above: A
// 80-89: B
// 70-79: C
// 60-69: D
// Below 60: F
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // char alpha = sc.next().charAt(0);
        int percentage = sc.nextInt();
        sc.close();
        if(100>= percentage && 90<= percentage){
            System.out.println("A");
        }
        else if(89>= percentage && 80<= percentage){
            System.out.println("B");
        }
        else if(79>= percentage && 70<= percentage){
            System.out.println("C");
        }
        else if(69>= percentage && 60<= percentage){
            System.out.println("D");
        }
        else{
            System.out.println("You are Fail ");
        }

    }
}
