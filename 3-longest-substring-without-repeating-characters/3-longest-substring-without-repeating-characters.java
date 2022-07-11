class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size = s.length();
        if (size == 0) {
            return 0;
        } else if (size == 1) {
            return 1;
        }
        int max = 0;
        List<String> list = new ArrayList<>();
        boolean neverDuplicated = true;
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i=0; i<size-1; i++) {
            map.clear();
            map.put(s.charAt(i), i);
            for (int j=i+1; j<size; j++) {
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
            return size;
        }
        return max;
    }
}