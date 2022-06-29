import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        String str = "";
        for (int num : digits) {
            str += num;
        }
        BigInteger bigNumber = new BigInteger(str);
        bigNumber = bigNumber.add(new BigInteger("1"));
        str = bigNumber.toString();
        //System.out.println(str);
        int[] result = new int[str.length()];
        for (int i=0; i<str.length(); i++) {
            result[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return result;
    }
}