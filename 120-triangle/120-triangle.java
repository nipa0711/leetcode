class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] arr = new int[n][n];
        for (int a[] : arr) {
            Arrays.fill(a, Integer.MAX_VALUE);
        }        
        
        for (int i=0; i<n; i++) {
            if (i == 0) {
                arr[0][0] = triangle.get(0).get(0);
                continue;
            }
            arr[i][0] = arr[i-1][0] + triangle.get(i).get(0);
            arr[i][triangle.get(i).size()-1] = arr[i-1][triangle.get(i-1).size()-1] + triangle.get(i).get(triangle.get(i).size()-1);
            for (int j=1; j<triangle.get(i).size()-1; j++) {
                arr[i][j] = Math.min(arr[i-1][j-1] + triangle.get(i).get(j), arr[i-1][j] + triangle.get(i).get(j));
            }
        }
        
        int min = Integer.MAX_VALUE;
        for (int i=0; i<n; i++) {
            if (arr[n-1][i] < min) {
                min = arr[n-1][i];
            }
        }        
        
        return min;
    }
}