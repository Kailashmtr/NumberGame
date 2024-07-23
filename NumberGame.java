import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Set the range of numbers
        int min = 1;
        int max = 100;

        // Set the number of attempts
        int attempts = 5;

        // Generate a random number
        int randomNumber = random.nextInt(max - min + 1) + min;

        // Start the game loop
        boolean gameOver = false;
        int tries = 0;
        while (!gameOver && tries < attempts) {
            System.out.println("Guess a number between " + min + " and " + max + ":");
            int guess = scanner.nextInt();

            // Check the guess
            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + (tries + 1) + " tries.");
                gameOver = true;
            }

            tries++;
        }

        // Check if the player ran out of attempts
        if (!gameOver) {
            System.out.println("You ran out of attempts! The number was " + randomNumber);
        }

        scanner.close();
    }
}
