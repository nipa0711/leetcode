class Solution {
    public boolean repeatedSubstringPattern(String s) {        
        final int sSize = s.length();
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < sSize; i++) {
			if(sSize % i == 0) {
                list.add(i);
			}
		}
        
        for (int i=0; i<list.size(); i++) {
            String str = s.substring(0, list.get(i));
            String temp = "";
            for (int j=1; j<=sSize/str.length(); j++) {
                temp += str;
            }
            if (temp.equals(s)) {
                return true;
            }
        }
        return false;
    }
}