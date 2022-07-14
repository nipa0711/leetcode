class Solution {
    public int countAsterisks(String s) {
        if (s.indexOf("*") == -1) {
            return 0;
        }
        
        String[] arr = s.split("\\|");
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<arr.length; i++) {
            if (i%2==0) {
                sb.append(arr[i]);
            }
        } 
        String result = sb.toString();
        int resultLen = result.length();
        result = result.replace("*", "");
        int finalLen = result.length();
        return resultLen-finalLen;
    }
}