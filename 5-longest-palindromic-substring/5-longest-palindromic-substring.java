class Solution {
    boolean checkPalindrome(String s) {
        //char[] arr = s.toCharArray();
        for (int i=0; i<s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                //System.out.println("arr[i] : " + arr[i] + " arr[arr.length-1-i] : " + arr[arr.length-1-i]);
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
        StringBuilder sb;
        for (int i=0; i<s.length()-1; i++) {  
            for (int j=0; j<s.length(); j++) { 
                if (i>=s.length()-j) {
                    break;
                } else if (s.length()-j - i < answer.length()) {
                    break;
                }
                String parse = s.substring(i, s.length()-j);
                //System.out.println("parse : " + parse);
                if (checkPalindrome(parse) && parse.length() > answer.length()) {
                    answer = parse;
                }
                //sb = new StringBuilder(parse);
                //String reverse = sb.reverse().toString();
               // if (parse.equals(reverse) && parse.length() > answer.length()) {
                //    answer = parse;
               // }
            }
        }
        return answer;
    }
}