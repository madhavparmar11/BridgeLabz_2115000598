import java.util.Scanner;

public class BMIMultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; // 0: height, 1: weight, 2: BMI
        String[] status = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter height (m) and weight (kg) for person " + (i + 1) + ":");
            personData[i][0] = sc.nextDouble();
            personData[i][1] = sc.nextDouble();
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            if (personData[i][2] < 18.5) {
                status[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                status[i] = "Normal";
            } else if (personData[i][2] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + personData[i][0] + ", Weight = " + personData[i][1]
                    + ", BMI = " + personData[i][2] + ", Status = " + status[i]);
        }
    }
}
