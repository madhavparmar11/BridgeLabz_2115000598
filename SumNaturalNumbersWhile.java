import java.util.Scanner;

public class SumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (n > 0) {
            // Compute using formula
            int sumFormula = n * (n + 1) / 2;

            // Compute using while loop
            int sumWhile = 0;
            int i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }

            // Compare results
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumWhile);

            if (sumFormula == sumWhile) {
                System.out.println("Both computations match!");
            } else {
                System.out.println("There is an error in computation.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
}
