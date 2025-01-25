import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Handle negative numbers
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number = Math.abs(number);
        }

        // Find the number of digits in the number
        int temp = number;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Create an array to store the digits
        int[] digits = new int[count];
        int index = 0;

        // Store digits in the array
        while (number > 0) {
            digits[index++] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
        }

        // Display the elements of the digits array in reverse order
        System.out.print("Reversed number: ");
        if (isNegative) {
            System.out.print("-");
        }
        for (int digit : digits) {
            System.out.print(digit);
        }
        System.out.println();
    }
}
