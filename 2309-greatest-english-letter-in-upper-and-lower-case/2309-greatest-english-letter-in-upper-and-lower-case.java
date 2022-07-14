class Solution {
    public String greatestLetter(String s) {
        Map<Character, Character> small = new HashMap<>();
        Map<Character, Character> big = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >=65 && ch <=90) {
                if (!big.containsKey(ch)) {
                    big.put(ch, (char)(ch + 32));
                }
            } else if (ch>=97 && ch <= 122) {
                if (!small.containsKey(ch)) {
                    small.put(ch, (char)(ch - 32));
                }
            }
        }
        
        int answer = 0;
        for (Character value : big.values()) {
            if (small.containsKey(value)) {
                int letter = small.get(value);
                if (letter > answer) {
                    answer = letter;
                }
            }
        }
        
        if (answer == 0) {
            return "";
        }        
        
        return Character.toString((char) answer);
    }
}