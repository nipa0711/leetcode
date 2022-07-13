class Solution {
    public String freqAlphabets(String s) {
        Map<Integer, String> map = new HashMap<>();
        for (int i=1; i<=26; i++) {
            map.put(i, Character.toString((char)(96+i)));
        }
        StringBuilder sb = new StringBuilder(s);
        while (sb.indexOf("#") != -1) {
            int idx = sb.indexOf("#");  
            sb.replace(idx-2,idx+1, map.get(Integer.parseInt(sb.substring(idx-2, idx))));
        }
        for (int i=0; i<sb.length(); i++) {
            char ch = sb.charAt(i);
            if (map.containsKey(ch - '0')) {
                sb.replace(i, i+1, map.get(ch - '0'));
            }            
        }
        return sb.toString();
    }
}