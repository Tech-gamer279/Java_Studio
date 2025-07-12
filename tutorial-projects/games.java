// Simple Number Guessing Game in Java

import java.util.Scanner;
import java.util.Random;

public class GamesExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(10) + 1; // Random number between 1 and 10
        int guess;
        System.out.println("Guess a number between 1 and 10:");

        while (true) {
            guess = scanner.nextInt();
            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again:");
            } else {
                System.out.println("Too high! Try again:");
            }
        }
        scanner.close();
    }
}