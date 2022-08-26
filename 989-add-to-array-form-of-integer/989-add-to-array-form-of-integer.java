import java.math.BigInteger;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i : num) {
            sb.append(i);
        }
        
        BigInteger bigInt = new BigInteger(sb.toString());
        bigInt = bigInt.add(new BigInteger(String.valueOf(k)));
        
        List<Integer> list = new ArrayList<>();
        String answer = bigInt.toString();
        for (int i=0; i<answer.length(); i++) {
            list.add(answer.charAt(i) - '0');
        }
        return list;
    }
}