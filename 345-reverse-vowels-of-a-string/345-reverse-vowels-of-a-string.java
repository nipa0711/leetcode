class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<arr.length; i++) {
            char ch = arr[i];
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U') {
                sb.append(ch);
            }
        }
        
        String reversedStr = sb.reverse().toString();
        sb = new StringBuilder();
        int idx = 0;
        for (int i=0; i<arr.length; i++) {
            char ch = arr[i];
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U') {
                ch = reversedStr.charAt(idx++);
            }
            sb.append(ch);
        }
        
        return sb.toString();
        
    }
}