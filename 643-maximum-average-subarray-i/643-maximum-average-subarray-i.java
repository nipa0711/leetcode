class Solution {
    double sumArr(int[] nums, int start, int end) {
        double sum = 0;
        for (int i=start; i<end; i++) {
            sum += nums[i];
        }
        return sum;
    }
    public double findMaxAverage(int[] nums, int k) {
        double[] saved = new double[nums.length];
        int index = 0;
        saved[index++] = sumArr(nums, 0, k);        
        double answer = saved[0];
        for(int i=k; i<nums.length; i++) {            
            saved[index++] = saved[index-2] - nums[i-k] + nums[i];
            //System.out.println("saved[index] : " + saved[index-1]);
            //System.out.println("nums[i-k] : " + nums[i-k]);
            //System.out.println("nums[i] : " + nums[i]);
            //sum = sum/k;
            if (saved[index-1] > answer) {
                answer = saved[index-1];
            }
        }
        return answer/k;
    }
}