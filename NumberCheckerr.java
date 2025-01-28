import java.util.Arrays;

public class NumberCheckerr {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of a number using the digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number using the
    // digits array
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number using the digits array
    public static boolean isHarshadNumber(int[] digits, int originalNumber) {
        int sum = sumOfDigits(digits);
        return originalNumber % sum == 0;
    }

    // Method to find the frequency of each digit in the number. Creates a 2D array
    // to store frequencies
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // Array for digits 0-9, column 1 for frequency
        for (int digit : digits) {
            frequency[digit][0] = digit; // Store the digit in the first column
            frequency[digit][1]++; // Increment the frequency count
        }
        return frequency;
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        int number = 21; // Example number

        // Store digits of the number
        int[] digits = storeDigits(number);

        // Count digits
        System.out.println("Count of digits: " + countDigits(number));

        // Sum of digits
        System.out.println("Sum of digits: " + sumOfDigits(digits));

        // Sum of squares of digits
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));

        // Check if number is a Harshad number
        System.out.println("Is Harshad Number: " + isHarshadNumber(digits, number));

        // Find and display the frequency of each digit
        int[][] frequency = findDigitFrequency(digits);
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) { // Only print digits that are present in the number
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " times");
            }
        }
    }
}
