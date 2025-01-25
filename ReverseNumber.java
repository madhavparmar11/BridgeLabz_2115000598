import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        int count = 0;
        long temp = number;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];
        int index = 0;

        while (number != 0) {
            digits[index++] = (int) (number % 10);
            number /= 10;
        }

        System.out.println("Reversed number:");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
    }
}
