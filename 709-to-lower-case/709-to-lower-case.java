class Solution {
    public String toLowerCase(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : arr) {
            if (ch <= 90 && ch >= 65) {
                sb.append((char)(ch+32));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}