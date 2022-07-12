class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            int j=i;
            while (j<arr.length) {
                for (int a=i; a<=j; a++) {
                    sum+=arr[a];
                }
                j = j+2;
            }
        }
        return sum;
    }
}