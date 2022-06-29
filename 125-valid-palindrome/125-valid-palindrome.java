class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        StringBuffer sb = new StringBuffer(s);
        String reversedStr = sb.reverse().toString();        
        return s.equals(reversedStr);
    }
}