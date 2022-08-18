class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = new char[s.length()];
        Arrays.fill(arr, 'a');
        
        Stack<Character> stack = new Stack<>();
        
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                stack.push(ch);
            } else {
                arr[i] = ch;
            }
        }
        
        for (int i=0; i<s.length(); i++) {
            if (Character.isLetter(arr[i])) {
                arr[i] = stack.pop();
            }
        }        
        
        return new String(arr);
    }
}