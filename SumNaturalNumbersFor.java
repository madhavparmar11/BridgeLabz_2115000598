import java.util.Scanner;

public class SumNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (n > 0) {
            // Compute using formula
            int sumFormula = n * (n + 1) / 2;

            // Compute using for loop
            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }

            // Compare results
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using for loop: " + sumFor);

            if (sumFormula == sumFor) {
                System.out.println("Both computations match!");
            } else {
                System.out.println("There is an error in computation.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
}
