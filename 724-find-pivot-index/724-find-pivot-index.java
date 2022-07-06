class Solution {
    int countArr(int[] nums, int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            count += nums[i];
        }
        return count;
    }
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int start = 0;
        int last = nums.length;
        for (int pivot = 0; pivot<last; pivot++) {
            if (pivot == 0) {
                leftSum = 0;
                rightSum = countArr(nums, 1, last);
                if (leftSum == rightSum) {
                    return pivot;
                }
            } else if (pivot == last -1) {
                rightSum = 0;
                leftSum = countArr(nums, 0, last-1);
                if (leftSum == rightSum) {
                    return pivot;
                }
            } else {
                leftSum = countArr(nums, 0, pivot);
                rightSum = countArr(nums, pivot+1, last);
                if (leftSum == rightSum) {
                    return pivot;
                }
            }
        }
        return -1;
    }
}