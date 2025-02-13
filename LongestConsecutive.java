class LongestConsecutive {
    public static int findLongest(int[] arr) {
        int maxLen = 1, n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            int current = arr[i];
            for (int j = 0; j < n; j++) {
                if (arr[j] == current + 1) {
                    count++;
                    current++;
                    j = -1;
                }
            }
            if (count > maxLen) maxLen = count;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(findLongest(arr));
    }
}
