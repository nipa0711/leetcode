import java.math.BigInteger;
class Solution {
    public String convertToBase7(int num) {
        BigInteger bigInt = new BigInteger("" + num);
        return bigInt.toString(7);
    }
}