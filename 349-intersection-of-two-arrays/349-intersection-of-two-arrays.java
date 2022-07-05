class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for (int num : nums1) {
            hs1.add(num);
        }
        for (int num : nums2) {
            hs2.add(num);
        }
        
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> original = new ArrayList<>();
        
        Iterator iter = hs1.iterator();
        while(iter.hasNext()) {
            int num = (int)iter.next();
            list1.add(num);
            original.add(num);
		}
        
        iter = hs2.iterator();
        while(iter.hasNext()) {
            list2.add((int)iter.next());
		}
        
        list1.removeAll(list2);
        original.removeAll(list1);
        int[] answer = new int[original.size()];
        for (int i=0; i<original.size(); i++) {
            answer[i] = original.get(i);
        }
        
        /*
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
		}*/
        
        return answer;
    }
}