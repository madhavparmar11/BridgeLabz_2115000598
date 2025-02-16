import java.util.Arrays;

public class SearchChallenge {
    public static int findMissingPositive(int[] arr) {
        Arrays.sort(arr);
        int missing = 1;
        for (int num : arr) {
            if (num == missing) {
                missing++;
            }
        }
        return missing;
    }
    
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println("First missing positive: " + findMissingPositive(arr));
        Arrays.sort(arr);
        System.out.println("Target index: " + binarySearch(arr, 3));
    }
}