class Solution {
    public int maxProfit(int[] prices, int fee) {
        if (prices.length <= 1) {
            return 0;
        }
        
        int answer = 0;
        int temp = -prices[0];
        
        for (int i = 1; i < prices.length; i++) {
            answer = Math.max(answer, temp + prices[i] - fee);
            temp = Math.max(temp, answer - prices[i]);
        }

        return answer;
    }
}