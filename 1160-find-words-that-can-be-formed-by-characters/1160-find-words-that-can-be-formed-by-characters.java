class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<chars.length(); i++) {
            char ch = chars.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        int sum = 0;
        for (String word : words) {
            Map<Character, Integer> temp = new HashMap<>();
            for (int i=0; i<word.length(); i++) {
                char ch = word.charAt(i);         
                if (map.get(ch) == null) {
                    temp = new HashMap<>();
                    break;
                }
                temp.put(ch, temp.getOrDefault(ch, 0) + 1);
            }
            
            boolean check = false;
            for (Character ch : temp.keySet()) {
                int mapValue = map.get(ch);
                int tempValue = temp.get(ch);
                if (mapValue < tempValue) {
                    check = false;
                    break;
                } else {
                    check = true;
                }
            }
            
            if (check) {
                sum += word.length();
            }
        }
        return sum;
    }
}