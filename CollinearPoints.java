import java.util.Scanner;

public class CollinearPoints {

    // Method to check if the points are collinear using slope formula
    public static boolean areCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate the slopes
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);

        // Points are collinear if the slopes are equal
        return (slopeAB == slopeBC && slopeAB == slopeAC);
    }

    // Method to check if the points are collinear using the area of the triangle
    // formula
    public static boolean areCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate the area of the triangle
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // Points are collinear if the area is 0
        return (area == 0);
    }

    // Main method to test the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take inputs for the 3 points
        System.out.println("Enter coordinates for point A (x1, y1): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Enter coordinates for point B (x2, y2): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.println("Enter coordinates for point C (x3, y3): ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        // Check if the points are collinear using the slope method
        boolean isCollinearSlope = areCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Are the points collinear using the slope formula? " + isCollinearSlope);

        // Check if the points are collinear using the area method
        boolean isCollinearArea = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Are the points collinear using the area formula? " + isCollinearArea);

        // Sample case: A(2, 4), B(4, 6), C(6, 8)
        System.out.println("\nSample case: A(2, 4), B(4, 6), C(6, 8)");
        boolean isCollinearSample = areCollinearUsingSlope(2, 4, 4, 6, 6, 8);
        System.out.println("Are the points collinear using the slope formula? " + isCollinearSample);
        boolean isCollinearSampleArea = areCollinearUsingArea(2, 4, 4, 6, 6, 8);
        System.out.println("Are the points collinear using the area formula? " + isCollinearSampleArea);
    }
}
