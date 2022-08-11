class Solution {
    public int longestPalindromeSubseq(String s) {
        int size = s.length();
        int[][] arr = new int[size][size];
        
        for (int i = size - 1; i >= 0; i--) {
            arr[i][i] = 1;
            for (int j = i+1; j < size; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    arr[i][j] = arr[i+1][j-1] + 2;
                } else {
                    arr[i][j] = Math.max(arr[i+1][j], arr[i][j-1]);
                }
            }
        }
        return arr[0][size-1];
    }
}