public class nck {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        // First loop to count the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        // Second loop to store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1]; // The last element is the greatest
    }

    // Method to find the sum of the factors using the factors array
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of cubes of the factors using the factors array
    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3); // Cube each factor
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number; // Exclude the number itself
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number; // Exclude the number itself
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number; // Exclude the number itself
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Helper method to calculate factorial of a number
    private static int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        int number = 6; // Example number

        // Find and display the factors of the number
        int[] factors = findFactors(number);
        System.out.println("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Find and display the greatest factor
        System.out.println("Greatest factor: " + findGreatestFactor(factors));

        // Find and display the sum of factors
        System.out.println("Sum of factors: " + sumOfFactors(factors));

        // Find and display the product of factors
        System.out.println("Product of factors: " + productOfFactors(factors));

        // Find and display the product of cubes of the factors
        System.out.println("Product of cubes of factors: " + productOfCubeOfFactors(factors));

        // Check and display if the number is a perfect number
        System.out.println("Is perfect number: " + isPerfectNumber(number));

        // Check and display if the number is an abundant number
        System.out.println("Is abundant number: " + isAbundantNumber(number));

        // Check and display if the number is a deficient number
        System.out.println("Is deficient number: " + isDeficientNumber(number));

        // Check and display if the number is a strong number
        System.out.println("Is strong number: " + isStrongNumber(number));
    }
}
