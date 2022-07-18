class Solution {
    public int countSegments(String s) {
        s = s.replaceAll("\\s+", " ").trim();
        if ("".equals(s)) {
            return 0;
        }
        return s.split(" ").length;
    }
}