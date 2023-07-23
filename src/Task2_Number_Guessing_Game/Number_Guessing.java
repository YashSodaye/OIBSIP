package Task2_Number_Guessing_Game;

import java.util.Random;
import java.util.Scanner;

public class Number_Guessing {
    public static void main(String[] args) {
        int attempt= 0,tries=5;
        System.out.println("Guess The Number Game");
        System.out.println("The number is in between 1 and 100");
        Random r =new Random();
        Scanner sc = new Scanner(System.in);
        int randomNumber = r.nextInt(100);
        System.out.println("You have 5 tries to guess the number.");
        System.out.print("Guess the number: ");
        int enteredNumber = sc.nextInt();
        attempt = attempt + 1;
        while(randomNumber !=  enteredNumber ){
            if(randomNumber<enteredNumber){
                System.out.println("Hint: The number is lower than "+enteredNumber);
            }
            else{
                System.out.println("Hint: The number is higher than "+enteredNumber);
            }
            tries--;
            System.out.println("You have "+tries+" tries left.");
            if(tries == 0) {
                System.out.println("You ran out of tries.");
                System.out.println("The number was "+randomNumber);
                System.exit(0); //  To Stop
            }
            System.out.print("Guess the number: ");
            enteredNumber = sc.nextInt();
            attempt +=1;
        }
        System.out.println("Congratulations, You guessed the right number.");
    }
}
