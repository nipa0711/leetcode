class Solution {
    public boolean isPalindrome(int x) {
        String str = x + "";
        StringBuffer sb = new StringBuffer(str);
        String reversedStr = sb.reverse().toString();
        if (str.equals(reversedStr)) {
            return true;
        }
        return false;
    }
}