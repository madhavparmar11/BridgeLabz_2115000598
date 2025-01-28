import java.util.Scanner;

public class PositiveNegativeEvenOdd {

    // Method to check if the number is positive or negative
    public static String isPositive(int num) {
        return num >= 0 ? "Positive" : "Negative";
    }

    // Method to check if the number is even or odd
    public static String isEven(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Take input for 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Check each number
        for (int i = 0; i < 5; i++) {
            System.out.println("Number " + (i + 1) + ": " + isPositive(numbers[i]));
            if (numbers[i] >= 0) {
                System.out.println("Number " + (i + 1) + " is " + isEven(numbers[i]));
            }
        }

        // Compare first and last elements
        int comparison = compare(numbers[0], numbers[4]);
        if (comparison == 1) {
            System.out.println("First number is greater than last number.");
        } else if (comparison == 0) {
            System.out.println("First number is equal to last number.");
        } else {
            System.out.println("First number is less than last number.");
        }
    }
}
