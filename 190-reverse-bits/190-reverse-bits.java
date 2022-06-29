import java.math.BigInteger;
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        if (n==0) {
            return 0;
        }
        
        String str = "" + n;
        BigInteger bigInt = new BigInteger(str);
        str = bigInt.toString(2);
        if (n >= 0) {
            String temp = "";
            for (int i=0; i<32-str.length(); i++) {
                temp += "0";
            }
            str = temp + str;
            StringBuffer sb = new StringBuffer(str);
            String reversedStr = sb.reverse().toString();
            bigInt = new BigInteger(reversedStr, 2);            
            return bigInt.intValue();
        }
        
        String temp = "";
        for (int i=0; i<=32-str.length(); i++) {
            temp += "1";
        }
        str = str.replace("-", "");
        char[] chars = str.toCharArray();
        for (int i=0; i<str.length(); i++) {
            int num = Character.getNumericValue(chars[i]);
            if (num == 0) {
                temp += "1";
            } else {
                temp += "0";
            }
        }
        bigInt = new BigInteger(temp, 2);
        bigInt = bigInt.add(new BigInteger("1", 2));
        String result = bigInt.toString(2);
        StringBuffer sb = new StringBuffer(result);
        String reversedStr = sb.reverse().toString();
        bigInt = new BigInteger(reversedStr, 2);
        return bigInt.intValue();
    }
}