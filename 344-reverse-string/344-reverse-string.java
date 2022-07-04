class Solution {
    public void reverseString(char[] s) {
        for (int i=0; i<s.length/2; i++) {
            char ch1 = s[i];
            char ch2 = s[s.length-1-i];
            int a = ch1;
            int b = ch2;
            a = a + b;
            b = a - b;
            a = a - b;
            ch1 = (char)a;
            ch2 = (char)b;
            s[i] = ch1;
            s[s.length-1-i] = ch2;
        }
    }
}