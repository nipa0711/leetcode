class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        char[] patterns = pattern.toCharArray();
        if (strs.length != patterns.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i=0; i<patterns.length; i++) {
            char ch = patterns[i];
            if (!map.containsKey(ch)) {
                if (map.containsValue(strs[i])) {
                    return false;
                }
                map.put(ch, strs[i]);
                continue;
            }
            
            if (!map.get(ch).equals(strs[i])) {
                return false;
            }
        }
        return true;
    }
}