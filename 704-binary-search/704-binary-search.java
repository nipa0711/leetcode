class Solution {
    public int search(int[] nums, int target) {
        int result = Arrays.binarySearch(nums, target);
        if (result >= 0) {
            return result;
        }
        return -1;
    }
}