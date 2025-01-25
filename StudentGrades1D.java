import java.util.Scanner;

public class StudentGrades1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Create arrays for marks, percentages, and grades
        double[] physicsMarks = new double[numberOfStudents];
        double[] chemistryMarks = new double[numberOfStudents];
        double[] mathsMarks = new double[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        // Input marks
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("Enter marks for student %d:%n", i + 1);

            System.out.print("Physics: ");
            double physics = scanner.nextDouble();
            while (physics < 0) {
                System.out.print("Invalid marks! Enter positive value: ");
                physics = scanner.nextDouble();
            }
            physicsMarks[i] = physics;

            System.out.print("Chemistry: ");
            double chemistry = scanner.nextDouble();
            while (chemistry < 0) {
                System.out.print("Invalid marks! Enter positive value: ");
                chemistry = scanner.nextDouble();
            }
            chemistryMarks[i] = chemistry;

            System.out.print("Maths: ");
            double maths = scanner.nextDouble();
            while (maths < 0) {
                System.out.print("Invalid marks! Enter positive value: ");
                maths = scanner.nextDouble();
            }
            mathsMarks[i] = maths;

            // Calculate percentage
            percentages[i] = (physics + chemistry + maths) / 3;

            // Determine grade
            if (percentages[i] >= 90) {
                grades[i] = "A";
            } else if (percentages[i] >= 75) {
                grades[i] = "B";
            } else if (percentages[i] >= 50) {
                grades[i] = "C";
            } else {
                grades[i] = "R";
            }
        }

        // Display results
        System.out.println("\nResults:");
        System.out.printf("%-10s %-10s %-10s %-12s %-5s%n", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-12.2f %-5s%n", physicsMarks[i], chemistryMarks[i],
                    mathsMarks[i], percentages[i], grades[i]);
        }
    }
}
