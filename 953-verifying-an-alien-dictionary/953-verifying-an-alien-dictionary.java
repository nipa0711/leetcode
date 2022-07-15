class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for (int i=0; i<words.length-1; i++) {
            String word1 = words[i];
            String word2 = words[i+1];
            if (word1.equals(word2)) {
                continue;
            }
            
            int s1 = 0;
            int s2 = 0;
            while (s1<word1.length() && s2 < word2.length()) {
                char ch1 = word1.charAt(s1++);
                char ch2 = word2.charAt(s2++);
                if (ch1 == ch2) {
                    continue;
                } else if (order.indexOf(ch1) > order.indexOf(ch2)) {
                    return false;
                } else {
                    break;
                }
            }
            
            if (word1.indexOf(word2) != -1) {
                return false;
            }                   
        }
        
        return true;
    }
}