import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Array to store frequency of digits
        int[] frequency = new int[10];

        // Count digits
        while (number != 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        // Display frequency
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.printf("Digit %d: %d times%n", i, frequency[i]);
            }
        }
    }
}
