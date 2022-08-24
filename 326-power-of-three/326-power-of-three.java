import java.math.BigInteger;

class Solution {
    public boolean isPowerOfThree(int n) {
        if (n==1) {
            return true;
        } else if (n<0 || n%3 != 0) {
            return false;
        }
        return "1".equals(new BigInteger(String.valueOf(n)).toString(3).replace("0",""));
    }
}