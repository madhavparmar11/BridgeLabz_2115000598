import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int greatestFactor = 1;

        // Loop from number - 1 to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; // Stop once the greatest factor is found
            }
        }

        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
    }
}
