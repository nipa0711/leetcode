import java.math.BigInteger;
class Solution {
    public int myAtoi(String s) {
        boolean needContinue = true;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            int num = s.charAt(i);
            if (num == 32 && needContinue) {
                continue;
            } else if (num == 43 || num == 45) {
                if (!needContinue) {
                    break;
                }
                sb.append((char)num);
                needContinue = false;
                continue;
            }
            if (num >= 48 && num <= 57) {
                sb.append((char)num);
                needContinue = false;
            } else {
                break;
            }
        }
        
        try {
            BigInteger bigInt = new BigInteger(sb.toString());
            if (bigInt.compareTo(new BigInteger("" + Integer.MAX_VALUE)) == 1) {
                return Integer.MAX_VALUE;
            } else if (bigInt.compareTo(new BigInteger("" + Integer.MIN_VALUE)) == -1) {
                return Integer.MIN_VALUE;
            }
            return Integer.parseInt(bigInt.toString());
        } catch (Exception e) {
            return 0;
        }
    }
}