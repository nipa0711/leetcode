import java.math.BigInteger;

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n==1) {
            return true;
        } else if (n%2 != 0) {
            return false;
        } else if (n<0) {
            return false;
        }
        BigInteger bigInt = new BigInteger("" + n);        
        return bigInt.bitCount() == 1;
    }
}