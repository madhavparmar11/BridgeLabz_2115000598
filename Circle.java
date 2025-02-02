import java.util.Scanner;

public class Circle {
    private int radius;

    public Circle() {
        this(1);
    }

    public Circle(int radius) {
        System.out.println("Radius: " + radius);
        this.radius = radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int userRadius = scanner.nextInt();
        scanner.close();

        Circle c1 = new Circle(userRadius);
        System.out.println("Radius: " + c1.radius);
    }
}
