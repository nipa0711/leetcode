class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        int[] profits = new int[prices.length];
        profits[0] = 0;
        int min = prices[0];
        for (int i=1; i<prices.length; i++) {
            min = Math.min(min, prices[i]);
            profits[i] = Math.max((prices[i] - min), profits[i-1]);
        }
        return profits[prices.length-1];
    }
}