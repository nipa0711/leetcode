class Solution {
    public boolean isHappy(int n) {
        String str = "" + n;
        Map<String, Integer> map = new HashMap<>();
        do {
            int sum = 0;
            for (int i=0; i<str.length(); i++) {
                int num = str.charAt(i) - '0';
                sum += num * num;
            }
            str = "" + sum;
            if ("1".equals(str.replaceAll("0",""))) {
                return true;
            }
            if (!map.containsKey(str)) {
                map.put(str, sum);
            } else {
                break;
            }
        } while (true);
        return false;
    }
}