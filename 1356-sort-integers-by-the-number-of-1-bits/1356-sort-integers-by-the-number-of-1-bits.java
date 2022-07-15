import java.math.BigInteger;
class Solution {
    public int[] sortByBits(int[] arr) {
        
        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++) {
                int first = arr[i];
                int firstBitCount = new BigInteger(""+first).bitCount();
                int second = arr[j];
                int secondBitCount = new BigInteger(""+second).bitCount();
                
                if (firstBitCount > secondBitCount) {                    
                    arr[i] = second;
                    arr[j] = first;
                } else if (firstBitCount == secondBitCount && first > second) {
                    arr[i] = second;
                    arr[j] = first;
                }
            }
        }
        
        return arr;
    }
    
    
}