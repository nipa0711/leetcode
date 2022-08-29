class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if ('#' == ch) {
                if (!sStack.isEmpty()) {
                    sStack.pop();
                }                
            } else {
                sStack.push(ch);
            }
        }
        
        for (int i=0; i<t.length(); i++) {
            char ch = t.charAt(i);
            if ('#' == ch) {
                if (!tStack.isEmpty()) {
                    tStack.pop();
                }                
            } else {
                tStack.push(ch);
            }
        }
        
        if (sStack.size() != tStack.size()) {
            return false;
        }
        
        while(!sStack.isEmpty()) {
            char ch1 = sStack.pop();
            char ch2 = tStack.pop();
            if (ch1 != ch2) {
                return false;
            }
        }
        return true;
    }
}