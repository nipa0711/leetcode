class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Map<Integer, Integer> map = new LinkedHashMap<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            list1.add(num);
        }
        
        for (int num : arr2) {
            list2.add(num);
        }
        list1.removeAll(list2);
        System.out.println(list1);
        
        System.out.println(map);
        
        int index = 0;
        for (int key : arr2) {
            for (int i=0; i<map.get(key); i++) {
                arr1[index++] = key;
            }
        }
        
        for (int i=0; i<list1.size(); i++) {
            arr1[index++] = list1.get(i);
        }
        System.out.println("index : " + index);
        return arr1;
    }
}