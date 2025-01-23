import java.util.Scanner;

public class MarksAndGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter marks in Physics: ");
        double physics = sc.nextDouble();

        System.out.print("Enter marks in Chemistry: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter marks in Maths: ");
        double maths = sc.nextDouble();

        // Compute the total and percentage
        double totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 300) * 100;

        // Determine the grade
        String grade;
        String remarks;

        if (percentage >= 90) {
            grade = "A";
            remarks = "Excellent";
        } else if (percentage >= 80) {
            grade = "B";
            remarks = "Very Good";
        } else if (percentage >= 70) {
            grade = "C";
            remarks = "Good";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Fair";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Needs Improvement";
        } else {
            grade = "R";
            remarks = "Fail";
        }

        // Display results
        System.out.println("\nTotal Marks: " + totalMarks + "/300");
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        sc.close();
    }
}