class Solution {
    public int divide(int dividend, int divisor) {
        double result = (double)dividend/(double)divisor;
        int max = 2147483647;
        int min = -2147483648;
        System.out.println("result : " + result);
        if (result > max) {
            return max;
        } else if (result < min) {
            return min;
        }
        return (int)result;
    }
}