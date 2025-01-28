import java.util.Scanner;

public class NaturalNumberSum2 {

    public static int sumUsingRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumUsingRecursion(n - 1);
    }

    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Enter a natural number (n > 0).");
            return;
        }

        int sumRecursion = sumUsingRecursion(n);
        int sumFormula = sumUsingFormula(n);

        System.out.println("Sum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Both results match: " + (sumRecursion == sumFormula));
    }
}
