class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i=words.length-1; i>=0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}