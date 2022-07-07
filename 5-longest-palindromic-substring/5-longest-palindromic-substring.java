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
        if (s.length() == 1) {
            return s;
        }
        String answer = "";
        for (int i=0; i<s.length()-1; i++) {  
            for (int j=0; j<s.length(); j++) { 
                if (i>=s.length()-j) {
                    break;
                } else if (s.length()-j - i < answer.length()) {
                    break;
                }
                String parse = s.substring(i, s.length()-j);
                if (checkPalindrome(parse) && parse.length() > answer.length()) {
                    answer = parse;
                }
            }
        }
        return answer;
    }
}