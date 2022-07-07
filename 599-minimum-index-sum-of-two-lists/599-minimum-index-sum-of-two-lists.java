class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> answer = new ArrayList<>();
        List<String> commonList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<list1.length; i++) {
            String str = list1[i];
            map.put(str, i);
        }
        for (int i=0; i<list2.length; i++) {
            String str = list2[i];
            if (map.containsKey(str)) {
                int index = map.get(str) + i;
                map.put(str, index); 
                commonList.add(str);
            }
        }
        int min = Integer.MAX_VALUE;
        for (String str : commonList) {
            int idx = map.get(str);
            if (idx < min) {
                answer.clear();
                answer.add(str);
                min = idx;
            } else if (idx == min) {
                answer.add(str);
            }
        }
        return answer.toArray(new String[0]);
    }
}