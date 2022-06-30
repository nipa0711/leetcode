class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num) && i - map.get(num) <= k) {
                int result = i - map.get(num);
                return true;
            } else if (map.containsKey(num) && i -map.get(num) > k) {
                map.remove(num);
            }
            map.put(num, i);
        }
        return false;
    }
}