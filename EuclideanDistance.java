import java.util.Scanner;

public class EuclideanDistance {

    // Method to find the Euclidean distance between two points
    public static double euclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the equation of a line given two points
    public static double[] lineEquation(int x1, int y1, int x2, int y2) {
        double m = (double) (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[] { m, b };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1, y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2, y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        // Calculate Euclidean distance
        double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        // Calculate line equation
        double[] line = lineEquation(x1, y1, x2, y2);
        System.out.println("Line Equation: y = " + line[0] + "x + " + line[1]);
    }
}
