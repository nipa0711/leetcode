class Solution {
    public int arraySign(int[] nums) {
        double result = 1;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            result *= num;
        }
        System.out.println("result : " + result);
        if (result > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}