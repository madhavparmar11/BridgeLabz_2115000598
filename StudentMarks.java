import java.util.Random;
import java.util.Scanner;

public class StudentMarks {

    // Method to generate random scores for Physics, Chemistry, and Maths
    public static int[][] generateScores(int numberOfStudents) {
        Random rand = new Random();
        int[][] scores = new int[numberOfStudents][3]; // [0] for Physics, [1] for Chemistry, [2] for Maths

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = rand.nextInt(100); // Physics
            scores[i][1] = rand.nextInt(100); // Chemistry
            scores[i][2] = rand.nextInt(100); // Maths
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4]; // [0] for Total, [1] for Average, [2] for Percentage, [3]
                                                           // for rounded percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
            results[i][3] = Math.round(percentage * 100.0) / 100.0; // rounded to 2 decimal places
        }
        return results;
    }

    // Method to display the scorecard in tabular format
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student Scorecard:");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Physics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t\t%d\t\t%d\t%d\t%.2f\t%.2f\n", scores[i][0], scores[i][1], scores[i][2],
                    (int) results[i][0], results[i][1], results[i][3]);
        }
    }

    // Main method to run the Student Marks Program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        int[][] scores = generateScores(numberOfStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
}
