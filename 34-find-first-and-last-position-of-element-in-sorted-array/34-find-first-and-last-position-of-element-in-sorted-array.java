class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] answer = new int[] {-1, -1};
        
        int index = Arrays.binarySearch(nums, target);
        if (index < 0) {
            return answer;
        }
        
        int start = index;
        for (int i=index; i>=0; i--) {
            if (nums[i] == target) {
                start = i;
            }
        }
        
        int end = index;
        for (int i=index; i<nums.length; i++) {
            if (nums[i] == target) {
                end = i;
            }
        }
        answer[0] = start;
        answer[1] = end;
        
        return answer;
    }
}