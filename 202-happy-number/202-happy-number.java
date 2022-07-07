class Solution {
    public boolean isHappy(int n) {
        String str = "" + n;
        Map<String, Integer> map = new HashMap<>();
        do {
            int sum = 0;
            char[] arr = str.toCharArray();
            for (int i=0; i<arr.length; i++) {
                int num = arr[i] - '0';
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