class Solution {    
    public boolean checkInclusion(String s1, String s2) {
        if (s2.indexOf(s1) != -1) {
            return true;
        } else if (s1.length() > s2.length()) {
            return false;
        }
        char[] arr = s1.toCharArray();
        Arrays.sort(arr);
        int sum = 0;
        for (char ch : arr) {
            sum += ch;
        }
        int[] sumArr = new int[s2.length()];
        for (int i=0; i<s2.length(); i++) {
            sumArr[i] = s2.charAt(i);
        }        
        
        if (s2.length() == s1.length()) {
            int num = 0;
            for (int a : sumArr) {
                num += a;
            }
            if (sum == num) {
                char[] check = s2.toCharArray();
                Arrays.sort(check);
                if (Arrays.equals(arr, check)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        
        for (int i=0; i<s2.length()-s1.length()+1; i++) {
            int count = 0;
            for (int j=0; j<s1.length(); j++) {
                count += sumArr[j+i];
                if (count == sum) {
                    char[] check = s2.substring(i, j+i+1).toCharArray();
                    Arrays.sort(check);
                    if (Arrays.equals(arr, check)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}