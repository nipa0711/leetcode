class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> original = new ArrayList<>();
        for (int num : nums1) {
            list1.add(num);
            original.add(num);
        }
        for (int num : nums2) {
            list2.add(num);
        }
        
        list1.removeAll(list2);
        original.removeAll(list1);
        HashSet<Integer> hashSet = new HashSet<>();
        for(Integer num : original) {
            hashSet.add(num);
        }
        Iterator iter = hashSet.iterator();
        int[] answer = new int[hashSet.size()];
        int i = 0;
		while(iter.hasNext()) {
            answer[i++] = (int)iter.next();
		}
        
        return answer;
    }
}