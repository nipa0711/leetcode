class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max = nums[0];
        int min = max;
        int answer = max;
        
        for (int i=1; i<nums.length; i++) {
            int current = nums[i];
            int tempMax = Math.max(max * current, Math.max(min * current, current));
            min = Math.min(max * current, Math.min(min * current, current));
            max = tempMax;
            answer = Math.max(max, answer);
        }
        return answer;
    }
}