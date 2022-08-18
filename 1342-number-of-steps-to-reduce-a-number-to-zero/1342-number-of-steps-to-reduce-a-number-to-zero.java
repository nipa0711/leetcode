class Solution {
    public int numberOfSteps(int num) {
        int answer = 0;
        while (num>0) {
            if (num % 2 == 1) {
                num--;
                answer++;
            }
            num = num/2;
            answer++;
            if (num % 2 == 1) {
                num--;
                answer++;
            }
        }
        System.out.println("answer : " + answer);
        System.out.println("num : " + num);
        return answer;
    }
}