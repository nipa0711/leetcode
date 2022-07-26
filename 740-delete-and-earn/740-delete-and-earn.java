class Solution {
    public int deleteAndEarn(int[] nums) {
        
        int[] values = new int[10001];
        
        for (int num : nums) {
            values[num] += num;
        }
        int answer = 0;
        int previous = 0;
        for (int value : values) {
            int temp = Math.max(previous + value, answer);
            previous = answer;
            answer = temp;
        }        
        
        return answer;
    }
}