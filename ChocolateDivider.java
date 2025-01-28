import java.util.Scanner;

public class ChocolateDivider {

    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int quotient = numberOfChocolates / numberOfChildren;
        int remainder = numberOfChocolates % numberOfChildren;
        return new int[] { quotient, remainder };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        if (numberOfChildren == 0) {
            System.out.println("Division by zero is not possible!");
        } else {
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
            System.out.println("Each child gets " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }
    }
}
