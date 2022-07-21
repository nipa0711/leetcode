import java.math.BigInteger;
class Solution {    
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        Map<Integer, Character> map = new HashMap<>();
        for (int i=0; i<16; i++) {
            if (i<10) {
                map.put(i, (char)(48+i));
            } else {
                map.put(i, (char)(87+i));
            }
        }
        if (num < 0) {
            long n = num;
            n = (long)Math.pow(2, 32) + num;
            while (n != 0) {
                long remain = n % 16;
                sb.insert(0, map.get((int)remain));
                n = (n-remain) / 16;
            }
        } else {
            while (num != 0) {
                int remain = num % 16;
                sb.insert(0, map.get((int)remain));
                num = (num-remain) / 16;
            }
        }
        return sb.toString();
    }
}