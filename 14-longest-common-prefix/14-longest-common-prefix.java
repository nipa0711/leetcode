class Solution {
    public String longestCommonPrefix(String[] strs) {
        String answer = "";
        if (strs.length == 1) {
            return strs[0];
        }
        int min = 200;
        for (String str : strs) {
            if (str.length() < min) {
                min = str.length();
            }
        }
        //System.out.println("min : " + min);
        
        for (int i=0; i< min; i++) {
            char ch = strs[0].charAt(i);
            for (int j=1; j<strs.length; j++) {
                char now = strs[j].charAt(i);
                if (ch != now) {
                    return answer;
                }
                
                if (ch == now && j==strs.length-1) {
                    answer += String.valueOf(ch);
                }
            }            
        }
        
        return answer;
    }
}