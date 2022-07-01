class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replace("-","").toUpperCase();
        
        StringBuilder answer = new StringBuilder();
        int count = 0;
        int sLen = s.length();
        for (int i=0; i<sLen; i++) {
            if (count == k) {
                answer.append("-");
                count = 0;
            }
            answer.append(s.charAt(sLen-1-i));
            count++;
        }
        return answer.reverse().toString();
    }
}