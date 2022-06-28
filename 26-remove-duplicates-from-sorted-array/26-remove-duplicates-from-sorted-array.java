class Solution {
    public int removeDuplicates(int[] nums) {
        
        int count = 1;
        int pre = nums[0];
        for (int i=1; i<nums.length; i++) {
            int current = nums[i];
            if (pre<current) {
                pre = current;
                count++;
            }
        }
        for (int i=0; i<nums.length-1; i++) {
            int index = i + 1;
            int now = nums[i];            
            
            for (int j=i+1; j<nums.length; j++) {
                int next = nums[j];
                if (now < next) {
                    nums[index] = next;
                    break;
                }
            }
        }        
        
        return count;
    }
}