import java.util.Scanner;
import java.util.Random;

public class NumberGame {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int attempts = 6;
        int rounds = 0;
        int score = 0;

        boolean playAgain = true;

        while (playAgain) {
            int exactNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int guess;
            int attemptCount = 0;

            System.out.println("Welcome to our Number Guessing Game!");
            System.out.println("Guess the number between the given range " + minRange + " and " + maxRange + ".");

            while (attemptCount < attempts) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attemptCount++;

                if (guess == exactNumber) {
                    System.out.println("Congratulations! You guessed the number in " + attemptCount + " attempts.");
                    score++;
                    break;
                } else if (guess < exactNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (attemptCount == attempts) {
                System.out.println("Sorry, you've used all your attempts. \n THANK YOU FOR PLAYING... " +
                        "\nThe number was: " + exactNumber);
            }

            rounds++;

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = sc.next();

            if (!playAgainInput.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }
    }
}