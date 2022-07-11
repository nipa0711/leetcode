class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        }
        //char[] arr = s.toCharArray();
        int max = 0;
        List<String> list = new ArrayList<>();
        boolean neverDuplicated = true;
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i=0; i<s.length()-1; i++) {
            map.clear();
            map.put(s.charAt(i), i);
            for (int j=i+1; j<s.length(); j++) {
                if (map.containsKey(s.charAt(j))) {
                    String temp = s.substring(i, j);
                    if (!list.contains(temp) && temp.length() > max) {
                        list.add(temp);
                        max = temp.length();
                    }
                    neverDuplicated = false;
                    break;
                } else {
                    map.put(s.charAt(j), j);
                    max = Math.max(max, map.size());
                }
            }
        }
        if (neverDuplicated) {
            return s.length();
        }
        return max;
    }
}