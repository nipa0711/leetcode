class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        if (size == 1) {
            return 0;
        }
        int[] profits = new int[size];
        profits[0] = 0;
        int min = prices[0];
        for (int i=1; i<size; i++) {
            min = Math.min(min, prices[i]);
            profits[i] = Math.max((prices[i] - min), profits[i-1]);
        }
        return profits[size-1];
    }
}