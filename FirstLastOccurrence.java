public class FirstLastOccurrence {
    public static int[] searchRange(int[] nums, int target) {
        return new int[]{findBound(nums, target, true), findBound(nums, target, false)};
    }
    
    private static int findBound(int[] nums, int target, boolean first) {
        int left = 0, right = nums.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result = mid;
                if (first) right = mid - 1;
                else left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int[] range = searchRange(arr, 8);
        System.out.println("First: " + range[0] + ", Last: " + range[1]);
    }
}