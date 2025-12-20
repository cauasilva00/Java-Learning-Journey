import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 0 and 99.");
        System.out.println("You have up to 10 chances to guess the correct number.\n");
        System.out.println("Please select the difficulty level:");
        System.out.println("1. Easy (10 chances)");
        System.out.println("2. Medium (5 chances)");
        System.out.println("3. Hard (3 chances)\n");
        System.out.print("Enter your choice: ");
        int difficultyChoice = scanner.nextInt();
        int chances = 0;
        if (difficultyChoice == 1) {
            chances = 10;
            System.out.println("Great! You have selected the Easy difficulty level.");
        } else if (difficultyChoice == 2) {
            chances = 5;
            System.out.println("Great! You have selected the Medium difficulty level.");
        } else if (difficultyChoice == 3) {
            chances = 3;
            System.out.println("Great! You have selected the Hard difficulty level.");
        } else {
            System.out.println("Invalid choice.");
            System.exit(0);
        }

        System.out.println("Let's start the game!\n");
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        for(int i = 0; i < chances; ++i) {
            System.out.print("Attempt " + (i + 1) + "/" + chances + " - Enter your guess: ");
            int numberChoice = scanner.nextInt();
            if (numberChoice == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + (i + 1) + " attempts.");
                System.exit(0);
            } else if (numberChoice > randomNumber) {
                System.out.println("Incorrect! The number is less than " + numberChoice);
            } else {
                System.out.println("Incorrect! The number is greater than " + numberChoice);
            }
        }

        System.out.println("\nGAME OVER!");
        System.out.println("You've run out of chances. The secret number was: " + randomNumber);
    }
}
