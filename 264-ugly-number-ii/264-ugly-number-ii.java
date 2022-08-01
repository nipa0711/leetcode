class Solution {
    public int nthUglyNumber(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        
        int index2 = 1;
        int index3 = 1;
        int index5 = 1;
        
        int factor2 = 2;
        int factor3 = 3;
        int factor5 = 5;
        
        for(int i = 1; i < n ; i++) {
            int min = Math.min(Math.min(factor2,factor3), factor5);
            answer[i] = min;
            
            if (min == factor2) {
                factor2 = 2 * answer[index2++];
            }
            
            if (min == factor3) {
                factor3 = 3 * answer[index3++];
            }
            
            if (min == factor5) {
                factor5 = 5 * answer[index5++];
            }
        }
        return answer[n-1];
    }
}