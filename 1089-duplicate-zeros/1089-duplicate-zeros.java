class Solution {
    public void duplicateZeros(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (int num : arr) {
            if (num == 0) {
                queue.add(0);
            }
            queue.add(num);
        }
        
        for (int i=0; i<arr.length; i++) {
            int num = queue.poll();
            arr[i] = num;
        }
    }
}