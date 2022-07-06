class Solution {
    public int subtractProductAndSum(int n) {
        String temp = "" + n;
        char[] arr = temp.toCharArray();
        int sum = 0;
        int multiple = 1;
        
        for (char ch : arr) {
            int num = ch - '0';
            sum += num;
            multiple *= num;
        }
        return multiple - sum;
    }
}