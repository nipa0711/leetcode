import java.math.BigInteger;
class Solution {
    public int hammingDistance(int x, int y) {
        BigInteger bigInt1 = new BigInteger(""+x);
        BigInteger bigInt2 = new BigInteger(""+y);
        String a = bigInt1.toString(2);
        String b = bigInt2.toString(2);
        
        int sizeA = a.length();
        int sizeB = b.length();
        int which = sizeA >= sizeB ? 2 : 1;
        if (sizeA == sizeB) {
            which = 0;
        }
        int min = Math.min(sizeA, sizeB);
        int max = Math.max(sizeA, sizeB);
        if (which == 1) {
            String temp = "";
            for (int i=0; i<max-min; i++) {
                temp += "0";
            }
            a = temp + a;
        } else if (which == 2) {
            String temp = "";
            for (int i=0; i<max-min; i++) {
                temp += "0";
            }
            b = temp + b;
        }
        
        int answer = 0;
        for (int i=0; i<a.length(); i++) {
            char ch1 = a.charAt(i);
            char ch2 = b.charAt(i);
            if (ch1 != ch2) {
                answer++;
            }
        }
        return answer;
    }
}