class Solution {
    public int arraySign(int[] nums) {
        double result = 1;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            result *= num;
        }
        if (result > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}