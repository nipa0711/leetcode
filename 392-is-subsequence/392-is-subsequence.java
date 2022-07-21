class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.equals(t)) {
            return true;
        }
        
        if (s.length() > t.length()) {
            return false;
        }
        
        for (int i = 0; i < s.length(); i++) {
            try {
                int index = t.indexOf(s.charAt(i));
                if (index == -1) {
                    return false;
                }
                t = t.substring(index + 1);
            } catch (Exception e) {
                return false;
            }            
        }
        return true;
    }
}