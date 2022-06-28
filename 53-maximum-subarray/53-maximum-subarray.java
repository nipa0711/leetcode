class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum = Math.max(sum + num, num);
            max = Math.max(max, sum);
        }
        return max;
    }
}