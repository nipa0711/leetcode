class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        List<Integer> list = new ArrayList<>();
        
        for (int num : temp) {
            list.add(num);
        }
        
        for (int i=0; i<nums.length; i++) {
            temp[i] = list.indexOf(nums[i]);
        }
        return temp;
    }
}