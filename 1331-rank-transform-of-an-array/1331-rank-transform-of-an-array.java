class Solution {
    public int[] arrayRankTransform(int[] arr) {        
        int[] sortedArr = arr.clone();
        Map<Integer, Integer> map = new HashMap<>();

        Arrays.sort(sortedArr);

        for (int num : sortedArr) {
            map.putIfAbsent(num, map.size() + 1);
        }      

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }      

        return arr;
    }
}