import java.math.BigInteger;

class Solution {
    public boolean isPowerOfThree(int n) {
        if (n==1) {
            return true;
        } else if (n<0 || n%3 != 0) {
            return false;
        }
        BigInteger bigInt = new BigInteger("" + n);
        String str = bigInt.toString(3);
        str = str.replace("0","");
        return "1".equals(str);
    }
}