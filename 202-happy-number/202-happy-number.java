class Solution {
    public boolean isHappy(int n) {
        String str = "" + n;
        Map<String, Integer> map = new HashMap<>();
        int sum = 0;
        do {
            sum = 0;
            char[] arr = str.toCharArray();
            for (int i=0; i<arr.length; i++) {
                int num = arr[i] - '0';
                sum += num * num;
            }
            str = "" + sum;
            String check = str.replaceAll("0","");
            if ("1".equals(check)) {
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