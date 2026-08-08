import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        // Generate random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;

        int guess;

        System.out.println("===== NUMBER GAME =====");
        System.out.println("Guess a number between 1 and 100");

        while (true) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > randomNumber) {
                System.out.println("Too High!");
            }
            else if (guess < randomNumber) {
                System.out.println("Too Low!");
            }
            else {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            }
        }

        sc.close();
    }
}