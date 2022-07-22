import java.math.BigInteger;
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        if (n == 0) {
            return 0;
        }
        String str = ""+n;
        BigInteger bigInt = new BigInteger(str);
        str = bigInt.toString(2);
        
        if (n>=0) {
            str = str.replace("0","");
            return str.length();
        }
        
        int size = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<=32-size; i++) {
            sb.append("1");
        }
        str = str.replace("-", "");
        char[] chars = str.toCharArray();
        for (int i=0; i<size-1; i++) {
            int num = Character.getNumericValue(chars[i]);
            if (num == 0) {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        bigInt = new BigInteger(sb.toString(), 2);
        bigInt = bigInt.add(new BigInteger("1", 2));
        String result = bigInt.toString(2);
        result = result.replace("0","");
        return result.length();
    }
}