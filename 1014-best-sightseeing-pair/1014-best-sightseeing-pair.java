class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max = 0;
        int current = 0;
        
        for (int i=1; i<values.length; i++) {
            current = Math.max(current, values[i-1]+i-1);
            max = Math.max(max, current+values[i]-i);
        }
        return max;
    }
}