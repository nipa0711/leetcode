class Solution {
    public int mySqrt(int x) {
        int answer = 0;
        for (double i=1; i <= x; i++) {
            if ((i*i) > x) {
                break;
            }
            answer = (int)i;
        }
        return answer;
    }
    
    public boolean isPerfectSquare(int num) {
        int mine = mySqrt(num);
        
        return mine * mine == num;
    }
}