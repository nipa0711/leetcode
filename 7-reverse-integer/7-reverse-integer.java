import java.math.BigInteger;
class Solution {
    public int reverse(int x) {
        String str = ""+x;
        boolean isMinus = false;
        if (x<0) {
            str = str.substring(1);
            isMinus = true;
        }
        StringBuilder sb = new StringBuilder(str);
        str = sb.reverse().toString();        
        BigInteger bigInt = new BigInteger(str);
        if (bigInt.compareTo(new BigInteger("" + Integer.MAX_VALUE)) == 1
           || bigInt.compareTo(new BigInteger("" + Integer.MIN_VALUE)) == -1 ) {
            return 0;
        }
        str = bigInt.toString();
        if (isMinus) {
            str = "-" + str;
        }
        return Integer.parseInt(str);
    }
}