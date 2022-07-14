class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int start = 0;
        int end = grid.length-1;
        for (int i=0; i<grid.length; i++) {
            if (grid[i][start] == 0) {
                return false;
            }
            grid[i][start] = -1;
            if (start != end) {
                if (grid[i][end] == 0) {
                    return false;
                }
                grid[i][end] = -1;
            }            
            start++;
            end--;
        }
        
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid.length; j++) {
                if (grid[i][j] > 0) {
                    return false;
                }
            }
        }
        return true;
    }
}