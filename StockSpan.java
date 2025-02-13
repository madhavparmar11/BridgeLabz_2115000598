class StockSpan {
    public static void calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i - 1; j >= 0 && prices[j] <= prices[i]; j--) {
                count++;
            }
            span[i] = count;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(span[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        calculateSpan(prices);
    }
}
