class Solution {
    List<List<Integer>> list = new ArrayList<>();
    void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            list.add(print(arr, visited, n));
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }
    
    List<Integer> print(int[] arr, boolean[] visited, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                list.add(arr[i]);
            }
        }
        return list;
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        for (int i=0; i<=nums.length; i++) {
            combination(nums, visited, 0, nums.length, i);
        }
        
        return list;
    }
}