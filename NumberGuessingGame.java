import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int low = 1, high = 100;
        int guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it. Type 'high' if my guess is too high, 'low' if it's too low, and 'correct' if I guessed right.");

        while (true) {
            guess = generateGuess(low, high, random);
            System.out.println("Is your number " + guess + "?");
            feedback = scanner.next().toLowerCase();

            if (feedback.equals("correct")) {
                System.out.println("Great! I guessed your number correctly.");
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input. Please type 'high', 'low', or 'correct'.");
            }

            if (low > high) {
                System.out.println("Something went wrong. Are you sure you provided correct feedback?");
                break;
            }
        }
        scanner.close();
    }

    private static int generateGuess(int low, int high, Random random) {
        return low + random.nextInt(high - low + 1);
    }
}
