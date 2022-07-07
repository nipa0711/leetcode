class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length-1;
        for (int i=0; i<size; i++) {            
            int max = nums[size-i];
            //System.out.println("max : " + max);
            for (int j=i+1; j<size; j++) {
                //System.out.println("nums[size-2-i] : " + nums[size-2-i]);
                //System.out.println("nums[size-1-j] : " + nums[size-2-j]);
                if (nums[size-1-i] + nums[size-1-j] > max) {
                    return max + nums[size-1-i] + nums[size-1-j];
                }
            }
        }
        return 0;
    }
}