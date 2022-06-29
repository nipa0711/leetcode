import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger binaryA = new BigInteger(a, 2);
        BigInteger binaryB = new BigInteger(b, 2);
        return binaryA.add(binaryB).toString(2);
    }
}