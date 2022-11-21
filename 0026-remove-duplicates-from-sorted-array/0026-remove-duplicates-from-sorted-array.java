class Solution {
    public int removeDuplicates(int[] nums) {
        
        int count = 1;
        int pre = nums[0];
        int size = nums.length;
        for (int i=1; i<size; i++) {
            int current = nums[i];
            if (pre<current) {
                pre = current;
                count++;
            }
        }
        for (int i=0; i<size-1; i++) {
            int index = i + 1;
            int now = nums[i];            
            
            for (int j=i+1; j<size; j++) {
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