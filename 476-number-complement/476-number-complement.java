import java.math.BigInteger;
class Solution {
    public int findComplement(int num) {
        BigInteger bigInt = new BigInteger(""+num);
        String str = bigInt.toString(2);
        String reverse = "";
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch=='0') {
                reverse+="1";
            } else {
                reverse+="0";
            }
        }
        bigInt = new BigInteger(reverse, 2);
        return Integer.parseInt(bigInt.toString());
    }
}