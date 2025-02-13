class SlidingWindowMax {
    public static void maxInWindow(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i <= n - k; i++) {
            int max = arr[i];
            for (int j = 1; j < k; j++) {
                if (arr[i + j] > max) max = arr[i + j];
            }
            System.out.print(max + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 2, 0, 5};
        int k = 3;
        maxInWindow(arr, k);
    }
}
