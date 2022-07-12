class Solution {
    public String mergeAlternately(String word1, String word2) {
        int minPosition = Math.min(word1.length(), word2.length());
        int which = word1.length() == minPosition ? 1 : 2;
        
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<minPosition; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        
        if (which == 1) {
            sb.append(word2.substring(minPosition, word2.length()));
        } else {
            sb.append(word1.substring(minPosition, word1.length()));
        }
        
        return sb.toString();
    }
}