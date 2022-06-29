class Solution {
    public int titleToNumber(String columnTitle) {
        Map<Character, Integer> map = new HashMap<>();
        char ch = 65;        
        for (int i=1; i<=26; i++) {
            map.put(ch, i);
            ch++;
        }
        
        int sum = 0;
        for (int i=0; i<columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            int num = map.get(c);
            sum += num * Math.pow(26, columnTitle.length()-1-i);
        }
        return sum;
    }
}