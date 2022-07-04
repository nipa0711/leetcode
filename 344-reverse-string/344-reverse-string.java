class Solution {
    public void reverseString(char[] s) {
        for (int i=0; i<s.length/2; i++) {
            int a = s[i];
            int b = s[s.length-1-i];
            a = a + b;
            b = a - b;
            a = a - b;
            s[i] = (char)a;
            s[s.length-1-i] = (char)b;
        }
    }
}