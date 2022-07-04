class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            StringBuilder temp = new StringBuilder(str);
            sb.append(temp.reverse());
            sb.append(" ");
        }
        return sb.toString().substring(0, sb.length()-1);
    }
}