import java.util.Random;
import java.util.Scanner;

public class Q04_NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secret = random.nextInt(100) + 1;
        int attempts = 0;
        int guess;

        System.out.println("Guess a number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");

            while (!sc.hasNextInt()) {
                System.out.print("Enter a valid integer: ");
                sc.next();
            }

            guess = sc.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Choose a number from 1 to 100.");
            } else if (guess < secret) {
                System.out.println("Too low!");
            } else if (guess > secret) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed it.");
                System.out.println("Attempts: " + attempts);
            }
        } while (guess != secret);

        sc.close();
    }
}
