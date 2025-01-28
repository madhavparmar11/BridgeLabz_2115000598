import java.util.Random;

public class FootballTeam {

    // Method to generate random heights between 150 and 250 cm for 11 players
    public static int[] generateRandomHeights() {
        Random rand = new Random();
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // Generates a random number between 150 and 250
        }

        return heights;
    }

    // Method to calculate the sum of all elements in the array
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = generateRandomHeights();

        // Displaying the heights of all players
        System.out.println("Heights of players (in cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        // Displaying the shortest, tallest, and mean height
        System.out.println("Shortest Height: " + findShortest(heights));
        System.out.println("Tallest Height: " + findTallest(heights));
        System.out.println("Mean Height: " + findMean(heights));
    }
}
