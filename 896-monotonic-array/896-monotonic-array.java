class Solution {
    public boolean isMonotonic(int[] nums) {
        int check = -1;
        for (int i=1; i<nums.length; i++) {
            if (nums[i]==nums[i-1]) {
                continue;
            }
            
            if (nums[i]>=nums[i-1]) {
                if (check == -1) {
                    check = 1;
                } else if (check == 0) {
                    return false;
                }                
            } else if (nums[i]<=nums[i-1]) {
                if (check == -1) {
                    check = 0;
                } else if (check == 1) {
                    return false;
                }
            }
        }
        return true;
    }
}