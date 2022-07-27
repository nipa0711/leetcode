class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        
        if (nums.length == 1) {
            return sum;
        }
        
        int max1 = Integer.MIN_VALUE;
        int current = Integer.MIN_VALUE;
        for (int num : nums) {
            current = num + Math.max(current, 0);
            max1 = Math.max(max1, current);
        }
        
        int max2 = Integer.MAX_VALUE;
        current = Integer.MAX_VALUE;
        for (int i=1; i<nums.length; i++) {
            current = nums[i] + Math.min(current, 0);
            max2 = Math.min(max2, current);
        }
        max2 = sum - max2;
        
        int max3 = Integer.MAX_VALUE;
        current = Integer.MAX_VALUE;
        for (int i=0; i<nums.length-1; i++) {
            current = nums[i] + Math.min(current, 0);
            max3 = Math.min(max3, current);
        }
        
        return Math.max(max1, Math.max(max2, max3));
    }
}