import java.math.BigInteger;
class Solution {
    public int[] countBits(int n) {
        int[] answer = new int[n+1];
        for (int i=0; i<=n; i++) {
            String str = ""+i;
            BigInteger bigInt = new BigInteger(str);
            str = bigInt.toString(2);
            str = str.replace("0","");
            int count = str.length();
            answer[i] = count;
        }
        return answer;
    }
}