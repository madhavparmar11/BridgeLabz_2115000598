import java.util.Scanner;

public class StudentVoteChecker2 {
    // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18; // Can vote if age >= 18
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];

        // Input ages for 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        // Check voting eligibility
        for (int i = 0; i < 10; i++) {
            boolean canVote = canStudentVote(studentAges[i]);
            System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") can vote: " + canVote);
        }

        scanner.close();
    }
}
