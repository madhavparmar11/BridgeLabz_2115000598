import java.util.Scanner;

public class Quadratic {

    // Method to find the roots of the quadratic equation
    public static void findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("One root: " + root);
        } else {
            System.out.println("No real roots.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        // Find and display the roots
        findRoots(a, b, c);
    }
}
