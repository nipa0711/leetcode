import java.math.BigInteger;
class Solution {
    public int[] countBits(int n) {
        int[] answer = new int[n+1];
        BigInteger bigInt;
        for (int i=0; i<=n; i++) {
            String str = ""+i;
            bigInt = new BigInteger(str);
            str = bigInt.toString(2);
            str = str.replace("0","");
            answer[i] = str.length();
        }
        return answer;
    }
}