package Ques;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int userGuess;
        boolean hasGuessedCorrectly = false;
        int randomNumber = rn.nextInt(100) + 1;

        do{
            System.out.println("User guess the number: ");
            userGuess = sc.nextInt();

            if(userGuess == randomNumber){
                System.out.println("Congratulations you won !!");
                hasGuessedCorrectly = true;
            }
            else if (userGuess > randomNumber){
                System.out.println("Too high, Try Again");
            }
            else if (userGuess < randomNumber){
                System.out.println("Too Low, Try Again");
            }
        }while(!hasGuessedCorrectly);
        sc.close();
    }
}
