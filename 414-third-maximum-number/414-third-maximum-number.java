class Solution {
    public int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        if (list.size()>=3) {
            return list.get(2);
        } 
        return list.get(0);
    }
}