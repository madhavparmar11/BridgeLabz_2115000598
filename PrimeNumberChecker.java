import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Prime check
        if (number <= 1) {
            System.out.println(number + " is not a Prime Number.");
        } else {
            boolean isPrime = true; // Initialize the result as true

            // Loop from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Set isPrime to false if divisible
                    break; // Exit the loop
                }
            }

            // Output the result
            if (isPrime) {
                System.out.println(number + " is a Prime Number.");
            } else {
                System.out.println(number + " is not a Prime Number.");
            }
        }
    }
}
