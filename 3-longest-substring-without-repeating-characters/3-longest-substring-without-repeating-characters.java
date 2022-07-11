class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        }
        char[] arr = s.toCharArray();
        int max = 0;
        List<String> list = new ArrayList<>();
        boolean neverDuplicated = true;
        for (int i=0; i<arr.length-1; i++) {
            Map<Character, Integer> map = new LinkedHashMap<>();
            map.put(arr[i], i);
            for (int j=i+1; j<arr.length; j++) {
                if (map.containsKey(arr[j])) {
                    String temp = s.substring(i, j);
                    System.out.println(temp);
                    if (!list.contains(temp) && temp.length() > max) {
                        list.add(temp);
                        max = temp.length();
                    }
                    neverDuplicated = false;
                    break;
                } else {
                    map.put(arr[j], j);
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