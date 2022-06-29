class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.replaceAll("\\s+", " ");
        String[] arr = str.split(" ");
        int answer = 0;
        for (int i = arr.length -1; i >= 0; i--) {
            if (!" ".equals(arr[i])) {
                answer = arr[i].length();
                break;
            }
        }
        return answer;
    }
}