class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        for (int i=0; i<names.length; i++) {
            map.put(heights[i], names[i]);
        }

        List<Integer> keyList = new ArrayList<>(map.keySet());
        keyList.sort(Comparator.reverseOrder());
        for (int i=0; i<names.length; i++) {
            names[i] = map.get(keyList.get(i));
        }
        return names;
    }
}