//Number Game  

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;
        int noOfAttempts = 15;
        int points = 0;

        System.out.println("Heartiest Welcome to NUMBER GUESSING GAME!");

        do {
            int targetNumber = random.nextInt(max - min + 1) + min;
            int attempts = 0;
            int input;

            System.out.println("\nGuess the number between " + min + " to " + max);

            do {
                System.out.print("Enter your guess: ");
                input = scanner.nextInt();
                attempts++;

                if (input == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    points++;
                } else if (input < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

            } while (input != targetNumber && attempts < noOfAttempts);

            if (attempts == noOfAttempts) {
                System.out.println("Sorry, you have reached maximum limit of attempts.\nThe correct number was: " + targetNumber);
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
        } while (scanner.next().equalsIgnoreCase("yes"));

        System.out.println("\nEnd of the game.\nTotal points: " + points);

        scanner.close();
    }
}

