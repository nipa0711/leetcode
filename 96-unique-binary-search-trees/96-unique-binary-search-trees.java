import java.math.BigDecimal;
class Solution {
    // http://oeis.org/search?q=1%2C2%2C5%2C14%2C42%2C132%2C429%2C1430%2C4862&language=english&go=Search
    // Catalan numbers: C(n) = binomial(2n,n)/(n+1) = (2n)!/(n!(n+1)!).
    public int numTrees(int n) {
        BigDecimal[] factorial = new BigDecimal[2*n+1];
        factorial[0] = new BigDecimal(1);
        factorial[1] = new BigDecimal(1);
        for (int i=2; i<=2*n; i++) {
            factorial[i] = factorial[i-1].multiply(new BigDecimal(i));
        }
        
        return factorial[2*n].divide(factorial[n].multiply(factorial[n+1])).intValue();
    }
}