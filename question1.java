import java.util.*;
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int attempts = 10;
        int min = 1;
        int max = 100;
        int num = random.nextInt(max - min + 1) + min;
        boolean guessedCorrectly = false;
        System.out.println("Welcome to the number guessing game");

        while (attempts > 0 && !guessedCorrectly) {
            System.out.println("Please enter the number you have guessed: ");
            int guess = sc.nextInt();

            if (guess == num) {
                System.out.println("You have guessed it correctly");
                guessedCorrectly = true;
            } else {
                System.out.println("Oops! You have guessed it wrong. Please try again");
                attempts--;
                System.out.println("Attempts left: " + attempts);
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Sorry! You are out of attempts. The correct number was: " + num);
        }
    }
}