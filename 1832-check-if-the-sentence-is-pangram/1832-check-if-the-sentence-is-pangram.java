class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        
        boolean[] arr = new boolean[26];
        for (int i=0; i<sentence.length(); i++) {
            arr[sentence.charAt(i) - 97] = true;
        }
        
        for (boolean chk : arr) {
            if (!chk) {
                return false;
            }
        }
        return true;
    }
}