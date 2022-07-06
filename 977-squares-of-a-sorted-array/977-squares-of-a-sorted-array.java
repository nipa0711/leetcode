class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num*num);
        }
        
        Collections.sort(list);
        for (int i=0; i<list.size(); i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }
}