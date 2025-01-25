import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to display multiplication tables from 6 to 9: ");
        int num = sc.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println("Multiplication Table for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
