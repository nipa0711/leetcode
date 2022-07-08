class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        char[] diffArr = new char[4];
        int diffCount = 0;
        int diffIdx = 0;
        
        for (int i=0; i<s1.length(); i++) {
            if (arr1[i] != arr2[i]) {
                diffCount++;
                if (diffCount > 2) {
                    return false;
                }
                diffArr[diffIdx++] = arr1[i];
                diffArr[diffIdx++] = arr2[i];
            }
        }
        if (diffCount == 1) {
            return false;
        }
        
        if (diffArr[0] != diffArr[3]) {
            return false;
        } else if (diffArr[1] != diffArr[2]) {
            return false;
        }
        return true;
    }
}