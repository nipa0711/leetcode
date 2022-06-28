class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null || "".equals(needle)) {
            return 0;
        }
        
        return haystack.indexOf(needle);        
    }
}