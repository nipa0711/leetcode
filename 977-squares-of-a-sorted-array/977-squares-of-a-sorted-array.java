class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num*num);
        }
        
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}