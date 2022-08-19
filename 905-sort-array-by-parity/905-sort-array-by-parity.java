class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Deque<Integer> queue = new ArrayDeque<>();
        for (int num : nums) {
            if (num%2==0) {
                queue.addFirst(num);
            } else {
                queue.addLast(num);
            }
        }
        
        int index = 0;
        while(!queue.isEmpty()) {
            nums[index++] = queue.removeFirst();
        }
        return nums;
    }
}