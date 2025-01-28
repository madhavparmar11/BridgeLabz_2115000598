import java.util.Scanner;

public class AthleteRoundsCalculator {
    public static int calculateRounds(double side1, double side2, double side3, double totalDistance) {
        double perimeter = side1 + side2 + side3;
        return (int) Math.ceil(totalDistance / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 of the triangle (in meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 of the triangle (in meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 of the triangle (in meters): ");
        double side3 = sc.nextDouble();

        double totalDistance = 5000; // 5 km = 5000 meters
        int rounds = calculateRounds(side1, side2, side3, totalDistance);
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");
    }
}
