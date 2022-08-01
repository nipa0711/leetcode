import java.math.BigDecimal;
class Solution {
    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        
        int a = m-1 + n-1;
        int big = Math.max(m-1, n-1);
        int small = Math.min(m-1, n-1);
        
        BigDecimal answer = new BigDecimal(1);
        
        for (int i=0; i<a-big; i++) {
            answer = answer.multiply(new BigDecimal(a-i));
        }
                
        double[] fac = new double[small+1];
        fac[0] = 1;
        fac[1] = 1;
        for (int i=2; i<=small; i++) {
            fac[i] = fac[i-1] * i;
        }
        answer = answer.divide(new BigDecimal(fac[fac.length-1]));
        return answer.intValue();
    }
}