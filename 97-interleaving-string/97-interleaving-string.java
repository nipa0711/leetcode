class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        char[] arr3 = s3.toCharArray();
        
        boolean[][] answer = new boolean[arr1.length+1][arr2.length+1];
        
        answer[0][0] = true;
        
        for (int i=0; i<arr1.length; i++) {
            answer[i+1][0] = answer[i][0] && arr1[i] == arr3[i];
        }
        for (int i=0; i<arr2.length; i++) {
            answer[0][i+1] = answer[0][i] && arr2[i] == arr3[i];
        }

        for (int i=1; i<=arr1.length; i++) {
            for (int j=1; j<=arr2.length; j++) {
                answer[i][j] = (answer[i-1][j] && arr1[i-1] == arr3[i+j-1])
                    || (answer[i][j-1] && arr2[j-1] == arr3[i+j-1]);
            }                
        }
            
        return answer[arr1.length][arr2.length];
    }
}