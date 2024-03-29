class Solution {
    public boolean canJump(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        Queue<Integer> queue = new LinkedList<>();
        visited[0] = true;
        queue.add(0);
        
        while(!queue.isEmpty()) {
            int index = queue.poll();
            for (int i=1; i<=nums[index]; i++) {
                if (index + nums[index] > nums.length) {
                    return true;
                }
                int newIdx = index + i;
                
                if (!(0 <= newIdx && newIdx < nums.length) || visited[newIdx]) {
                    continue;
                }                    
                
                if (newIdx == nums.length - 1) {
                    return true;
                }                    
                
                visited[newIdx] = true;
                queue.add(newIdx);
            }
        }
        
        return visited[nums.length-1];
    }
}