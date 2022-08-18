import java.util.Collection;
class Solution {
    public boolean buddyStrings(String s, String goal) {
        int first = 0;
        int last = 0;
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            if (s.charAt(i) == goal.charAt(i)) {
                continue;
            }
            count++;
            if (count == 2) {
                last = i;
                continue;
            }
            if (count > 2) {
                return false;
            }
            first = i;
        }
        System.out.println("map : " + map);
        System.out.println("first : " + first);
        System.out.println("last : " + last);
        if (first == last) {
            Collection<Integer> values = map.values();
            for(int value : values) {
                if (value >= 2) {
                    return true;
                }
            }
            return false;
        }
        char[] temp = s.toCharArray();
        char ch = temp[first];
        temp[first] = temp[last];
        temp[last] = ch;
        s = String.valueOf(temp);
        System.out.println("s : " + s);
        
        return s.equals(goal);
    }
}