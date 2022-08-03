class NumMatrix {
    long[][] arr;

    public NumMatrix(int[][] matrix) {
        arr = new long[matrix.length+1][matrix[0].length+1];
        
        for (int i = 1; i < matrix.length+1; i++) {
            for (int j = 1; j < matrix[0].length+1; j++) {
                arr[i][j] = matrix[i-1][j-1] + arr[i-1][j] + arr[i][j-1] - arr[i-1][j-1];
            }                
        }            
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return (int)(arr[row2+1][col2+1] - arr[row2+1][col1] - arr[row1][col2+1] + arr[row1][col1]);
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */