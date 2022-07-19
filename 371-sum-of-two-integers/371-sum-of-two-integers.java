import java.math.BigInteger;
class Solution {
    public int getSum(int a, int b) {
        BigInteger bigInt = new BigInteger(String.valueOf(a));
        bigInt = bigInt.add(new BigInteger(String.valueOf(b)));
        return Integer.parseInt(bigInt.toString());
    }
}