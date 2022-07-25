class Solution {
    public boolean canJump(int[] nums) {
        int size = nums.length;
        boolean[] visited = new boolean[size];
        Queue<Integer> queue = new LinkedList<>();
        visited[0] = true;
        queue.add(0);
        
        while(!queue.isEmpty()) {
            int index = queue.poll();
            for (int i=1; i<=nums[index]; i++) {
                int newIdx = index + i;
                
                if (!(0 <= newIdx && newIdx < size) || visited[newIdx]) {
                    continue;
                }                    
                
                if (newIdx == size - 1) {
                    return true;
                }                    
                
                visited[newIdx] = true;
                queue.add(newIdx);
            }
        }
        
        return visited[size-1];
    }
}