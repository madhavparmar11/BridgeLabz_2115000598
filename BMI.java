import java.util.Scanner;

public class BMI {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        height = height / 100; // Convert height from cm to meters
        return weight / (height * height);
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3]; // [weight, height, bmi]

        // Input data for 10 individuals
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();

            // Calculate BMI
            data[i][2] = calculateBMI(data[i][0], data[i][1]);

            // Display BMI and status
            System.out.println("Person " + (i + 1) + " BMI: " + data[i][2] + " (" + getBMIStatus(data[i][2]) + ")");
        }
    }
}
