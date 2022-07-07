class Solution {
    boolean checkPalindrome(String s) {
        for (int i=0; i<s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int sSize = s.length();
        if (sSize == 1) {
            return s;
        }
        String answer = "";
        for (int i=0; i<sSize-1; i++) {  
            for (int j=0; j<sSize; j++) { 
                if (i>=sSize-j) {
                    break;
                } else if (sSize-j - i < answer.length()) {
                    break;
                }
                String parse = s.substring(i, sSize-j);
                if (checkPalindrome(parse) && parse.length() > answer.length()) {
                    answer = parse;
                }
            }
        }
        return answer;
    }
}