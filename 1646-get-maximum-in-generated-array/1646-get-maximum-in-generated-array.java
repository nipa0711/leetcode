class Solution {
    public int getMaximumGenerated(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int[] arr = new int[n+2];
        arr[0] = 0;
        arr[1] = 1;
        boolean flag = true;
        for (int i=1; i<=n/2; i++) {
            arr[i*2] = arr[i];
            arr[i*2+1] = arr[i] + arr[i+1];
        }
        
        int max = 1;
        for (int i=2; i<=n; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}