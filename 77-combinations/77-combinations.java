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
    
    public List<List<Integer>> combine(int n, int k) {
        boolean[] visited = new boolean[n];
        int[] arr = new int[n];
        for (int i=1; i<=n; i++) {
            arr[i-1] = i;
        }
                
        combination(arr, visited, 0, n, k);
        return list;
    }
}