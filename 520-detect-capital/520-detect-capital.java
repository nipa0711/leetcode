class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length()==1) {
            return true;
        }
        char[] arr = word.toCharArray();
        char firstCh = arr[0];
        if (firstCh>=97 && firstCh <=122) {
            // small
            for (int i=1; i<arr.length; i++) {
                char ch = arr[i];
                if (ch<97) {
                    return false;
                }
            }
        } else {
            // big
            boolean isAllBig = false;
            if (arr[1] < 97) {
                isAllBig = true;
            }
            for (int i=2; i<arr.length; i++) {
                char ch = arr[i];
                if (ch<97 && isAllBig == false) {
                    return false;
                } else if (ch>=97 && isAllBig == true) {
                    return false;
                }
            }
        }
        return true;
    }
}