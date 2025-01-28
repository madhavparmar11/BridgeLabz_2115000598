public class numbercheck {

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

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversedDigits = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversedDigits[i] = digits[digits.length - 1 - i];
        }
        return reversedDigits;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int[] digits) {
        int[] reversedDigits = reverseDigits(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    // Method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        int number = 121; // Example number

        // Store digits of the number
        int[] digits = storeDigits(number);

        // Count digits
        System.out.println("Count of digits: " + countDigits(number));

        // Reverse the digits array
        int[] reversedDigits = reverseDigits(digits);
        System.out.println("Reversed digits: ");
        for (int digit : reversedDigits) {
            System.out.print(digit);
        }
        System.out.println();

        // Check if the number is a palindrome
        System.out.println("Is palindrome: " + isPalindrome(digits));

        // Check if the number is a duck number
        System.out.println("Is duck number: " + isDuckNumber(digits));
    }
}
