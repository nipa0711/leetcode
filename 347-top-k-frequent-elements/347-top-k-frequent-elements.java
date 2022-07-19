class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println("map : " + map);        
        
        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        
        int index = 0;
        int[] answer = new int[k];
        for(Map.Entry<Integer, Integer> entry : entryList) {
            System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
            answer[index] = entry.getKey();
            index++;
            if (index>=k) {
                break;
            }
        }    
        
        return answer;
    }
}