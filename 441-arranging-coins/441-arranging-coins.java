class Solution {
    public int arrangeCoins(int n) {
        long answer = 0;
        for (int i=1; i<=n; i++) {
            answer += i;
            if (answer > n) {
                answer = i - 1;
                break;
            } else if (answer == n) {
                answer = i;
                break;
            }
        }
        return (int)answer;
    }
}