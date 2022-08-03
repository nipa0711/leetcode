class Solution {
    public void duplicateZeros(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (int num : arr) {
            if (num == 0) {
                queue.add(0);
            }
            queue.add(num);
            if (queue.size() == arr.length) {
                break;
            }
        }
        
        for (int i=0; i<arr.length; i++) {
            arr[i] = queue.poll();
        }
    }
}