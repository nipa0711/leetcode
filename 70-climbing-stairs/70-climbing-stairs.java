class Solution {
    public int climbStairs(int n) {
        if (n==1) {
            return 1;
        } else if (n==2) {
            return 2;
        }
        
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;        
        
        int answer = 0;
        for (int i=2; i<n; i++) {
            answer = arr[i-2] + arr[i-1];
            arr[i] = answer;
        }
        //System.out.println("answer : " + answer);
        return answer;
    }
}