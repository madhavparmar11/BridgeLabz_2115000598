class ZeroSumSubarrays {
    public static void findSubarrays(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == 0) System.out.println(i + " " + j);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        findSubarrays(arr);
    }
}
