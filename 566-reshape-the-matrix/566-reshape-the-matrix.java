class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int h = mat.length;
        int w = mat[0].length;
        if (h * w != r * c) {
            return mat;
        }
        int[][] answer = new int[r][c];
        int rIdx = 0;
        int cIdx = 0;
        for (int i=0; i<h; i++) {
            for (int j=0; j<w; j++) {
                answer[rIdx][cIdx++] = mat[i][j];
                if (cIdx == c) {
                    rIdx++;
                    cIdx = 0;
                } 
            }           
        }
        return answer;
    }
}