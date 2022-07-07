class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        for (int i=0; i<size-1; i++) {            
            int max = nums[size-1-i];
            //System.out.println("max : " + max);
            for (int j=i+1; j<size-1; j++) {
                //System.out.println("nums[size-2-i] : " + nums[size-2-i]);
                //System.out.println("nums[size-1-j] : " + nums[size-2-j]);
                if (nums[size-2-i] + nums[size-2-j] > max) {
                    return max + nums[size-2-i] + nums[size-2-j];
                }
            }
        }
        return 0;
    }
}