class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        char ch = '0';
        for (int i=0; i<s.length(); i++) {
            ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        for (int i=0; i<t.length(); i++) {
            ch = t.charAt(i);
            if (!map.containsKey(ch)) {
                break;
            } else {
                map.put(ch, map.getOrDefault(ch, 0) - 1);
                if (map.get(ch) == -1) {
                    break;
                }
            }
        }
        return ch;
    }
}