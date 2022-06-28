class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != val) {
                count++;
            }
        }
        for (int i=0; i<nums.length-1; i++) {
            int first = nums[i];
            if (first!=val) {
                continue;
            }
            int index = i;
            for (int j=nums.length-1; j>=i; j--) {
                int last = nums[j];
                if (last!=val) {
                    index = j;
                    break;
                }
            }
            int temp = first;
            nums[i] = nums[index];
            nums[index] = temp;
        }
        return count;
    }
}