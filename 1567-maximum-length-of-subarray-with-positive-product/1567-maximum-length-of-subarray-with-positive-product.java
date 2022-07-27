class Solution {
    public int getMaxLen(int[] nums) {
        int max = 0;
        int positive = 0;
        int negative = 0;
        
        for (int num : nums) {
            if (num == 0) {
                positive = 0;
                negative = 0;
            } else if (num > 0) {
                positive++;
                if (negative != 0) {
                    negative++;
                }
                max = Math.max(max, positive);
            } else {
                positive = positive + negative;
                negative = positive - negative;
                positive = positive - negative;
                negative++;
                
                if (positive != 0) {
                    positive++;
                }
                max = Math.max(max, positive);
            }
        }
        return max;
    }
}