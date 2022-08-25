class Solution {
    List<List<Integer>> lists = new ArrayList<>();
    void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            List<Integer> temp = print(arr, visited, n);
            if (!lists.contains(temp)) {
                lists.add(temp);
            }
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }
    
    List<Integer> print(int[] arr, boolean[] visited, int n) {
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (visited[i]) {                
                temp.add(arr[i]);
            }
        }
        return temp;
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        for (int i=0; i<=nums.length; i++) {
            combination(nums, visited, 0, nums.length, i);
        }
        
        return lists;
    }
}