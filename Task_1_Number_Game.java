import java.util.*;

public class Task_1_Number_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 8;
        int score = 0;

        System.out.println("Welcome to Number Guessing Game");
        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("Guess the number from " + minRange + " to " + maxRange);
            System.out.println("You have " + maxAttempts + " attempts");
            int attempts = 0;
            boolean guessedCorrectly = false;

            while (attempts < maxAttempts) {
                System.out.println("Enter your guessing number");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations, You guessed the correct number");
                    guessedCorrectly = true;
                    break;
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you have reached the maximum number of attempts. So the correct number is: "
                        + targetNumber);
            } else {
                score++;
                System.out.println("Your current score: " + score);
            }

            System.out.println("Do you want to play again? (yes/no):");
            String playAgainResponse = sc.next().toLowerCase();
            if (!playAgainResponse.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thank you for playing! Your final score: " + score);
        sc.close();
    }
}
