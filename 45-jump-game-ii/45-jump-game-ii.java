class Solution {
    public int jump(int[] nums) {
        int count = 0;
        int currentMax = 0;
        int nextMax = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            nextMax = Math.max(nextMax, i + nums[i]);
            
            if (i == currentMax) {
                count++;
                currentMax = nextMax;
            }
        }
        return count;
    }
}