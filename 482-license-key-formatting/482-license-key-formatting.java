class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replace("-","");
        s = s.toUpperCase();
        
        String answer = "";
        int count = 0;
        for (int i=0; i<s.length(); i++) {
            if (count == k) {
                answer += "-";
                count = 0;
            }     
            answer += s.charAt(s.length()-1-i);
            count++;
        }
        StringBuffer sb = new StringBuffer(answer);
        return sb.reverse().toString();
    }
}