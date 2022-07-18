class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        int answer = 0;
        boolean once = false;
        for (int value : map.values()) {
            if (value % 2 == 0) {
                answer += value;
            } else if (value % 2 == 1 && value > 1) {
                answer += (value -1);
                once = true;
            } else if (value == 1 && !once) {
                once = true;
            }
        }
        if (once) {
            answer++;
        }
        
        return answer;
    }
}