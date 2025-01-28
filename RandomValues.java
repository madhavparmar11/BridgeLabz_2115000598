import java.util.Random;

public class RandomValues {

    // Method to generate 4-digit random values
    public static int[] generate4DigitRandomArray(int size) {
        Random rand = new Random();
        int[] randomNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            randomNumbers[i] = rand.nextInt(9000) + 1000; // Generate random 4-digit number
        }
        return randomNumbers;
    }

    // Method to calculate the average, min, and max
    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / (double) numbers.length;
        return new double[] { average, min, max };
    }

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Find and display the average, min, and max
        double[] results = findAverageMinMax(randomNumbers);
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
