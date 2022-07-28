class Solution {
    public int distributeCandies(int[] candyType) {
        /*
        Map<Integer, Integer> map = new HashMap<>();
        for (int candy : candyType) {
            map.put(candy, map.getOrDefault(candy, 0) + 1);
        }
        
        return Math.min(candyType.length/2, map.size());
        */
        Set<Integer> set = new HashSet();
        for (int candy : candyType) {
            set.add(candy);
        }
        return Math.min(candyType.length/2, set.size());
    }
}