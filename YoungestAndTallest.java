import java.util.Scanner;

public class YoungestAndTallest {

    // Method to find the youngest friend
    public static int findYoungest(int[] ages) {
        int youngest = ages[0];
        for (int age : ages) {
            if (age < youngest) {
                youngest = age;
            }
        }
        return youngest;
    }

    // Method to find the tallest friend
    public static double findTallest(double[] heights) {
        double tallest = heights[0];
        for (double height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take user input for ages and heights of 3 friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of friend " + (i + 1) + " in meters: ");
            heights[i] = sc.nextDouble();
        }

        // Find and display the youngest and tallest
        int youngest = findYoungest(ages);
        double tallest = findTallest(heights);

        System.out.println("The youngest age is: " + youngest);
        System.out.println("The tallest height is: " + tallest + " meters.");
    }
}
