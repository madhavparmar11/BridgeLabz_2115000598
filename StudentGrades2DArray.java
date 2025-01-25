import java.util.Scanner;

public class StudentGrades2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Define 2D array for marks (rows = students, cols = subjects)
        double[][] marks = new double[numStudents][3];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                do {
                    System.out.print(subject + " marks (0-100): ");
                    marks[i][j] = scanner.nextDouble();
                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("Invalid marks. Please enter a valid value between 0 and 100.");
                    }
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }
        }

        // Calculate percentage and grade for each student
        for (int i = 0; i < numStudents; i++) {
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = totalMarks / 3; // Calculate percentage

            // Determine grade based on percentage
            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 80) {
                grades[i] = 'B';
            } else if (percentages[i] >= 70) {
                grades[i] = 'C';
            } else if (percentages[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        // Display marks, percentage, and grade for each student
        System.out.println("\nStudent Results:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t\t%.2f\t%.2f%%\t\t%c\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }
}
