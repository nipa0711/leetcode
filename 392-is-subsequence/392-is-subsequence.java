class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.equals(t)) {
            return true;
        }
        
        if (s.length() > t.length()) {
            return false;
        }
        
        //int saved = 0;
        for (int i = 0; i < s.length(); i++) {
            try {
                int index = t.indexOf(s.charAt(i));
                ///System.out.println("index : " + index);
                //System.out.println("t : " + t);
                if (index == -1) {
                    return false;
                }
                /*
                if (saved > index) {
                    return false;
                }
                saved = index;*/
                t = t.substring(index + 1);
            } catch (Exception e) {
                return false;
            }            
        }
        return true;
    }
}