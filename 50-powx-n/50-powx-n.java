class Solution {
    public double myPow(double x, int n) {
        if (x == 1) {
            return 1;
        } else if (x == 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        }
        boolean isMinus = false;
        if (x < 0 && n % 2 == 1) {
            isMinus = true;
        }
        double val = n *  Math.log(Math.abs(x));
        double answer = Math.exp(val);       
        if (isMinus) {
            answer = -1 * answer;
        }
        
        return answer;
    }
}