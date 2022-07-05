class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length ; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i],0) +1);
        }
        
        List<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                map.put(num, map.get(num) - 1);
                list.add(num);
            }
        }
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}