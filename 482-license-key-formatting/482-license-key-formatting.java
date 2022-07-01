class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replace("-","");
        s = s.toUpperCase();
        
        String answer = "";
        int count = 0;
        int sLen = s.length();
        for (int i=0; i<sLen; i++) {
            if (count == k) {
                answer += "-";
                count = 0;
            }     
            answer += s.charAt(sLen-1-i);
            count++;
        }
        StringBuffer sb = new StringBuffer(answer);
        return sb.reverse().toString();
    }
}