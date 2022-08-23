class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) {
            return list;
        }
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int key = nums[0];
        for (int num : nums) {
            if (map.containsValue(num-1)) {
                map.put(key, num);
            } else {
                map.put(num, num);
                key = num;
            }
        }
        System.out.println("map : " + map);
        for (Integer num : map.keySet()) {
            int value = map.get(num);
            if (num == value) {
                list.add(""+value);
            } else {
                list.add(num+"->"+value);
            }
        }
        System.out.println("list : " + list);
        
        
        return list;
    }
}