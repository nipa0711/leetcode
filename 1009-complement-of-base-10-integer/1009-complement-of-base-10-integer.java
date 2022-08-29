import java.math.BigInteger;

class Solution {
    public int bitwiseComplement(int n) {
        BigInteger bigInt = new BigInteger(String.valueOf(n));
        String str = bigInt.toString(2);
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '1') {
                sb.append('0');
            } else {
                sb.append('1');
            }
        }
        
        return new BigInteger(sb.toString(), 2).intValue();
    }
}