class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.equals(t)) {
            return true;
        } else if (s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Character> map = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (!map.containsKey(ch1)) {
                if (map.containsValue(ch2)) {
                    return false;
                }
                map.put(ch1, ch2);
            } else {
                if (map.get(ch1) != ch2) {
                    return false;
                }
            }            
        }
        
        return true;
    }
}