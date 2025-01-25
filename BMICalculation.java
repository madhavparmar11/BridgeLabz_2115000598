import java.util.Scanner;

public class BMICalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[] heights = new double[number];
        double[] weights = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter height (m) and weight (kg) for person " + (i + 1) + ":");
            heights[i] = sc.nextDouble();
            weights[i] = sc.nextDouble();
            bmi[i] = weights[i] / (heights[i] * heights[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + heights[i] + ", Weight = " + weights[i]
                    + ", BMI = " + bmi[i] + ", Status = " + status[i]);
        }
    }
}
