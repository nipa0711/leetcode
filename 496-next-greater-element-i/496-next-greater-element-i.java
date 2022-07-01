class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack();
        for (int i=0; i<nums2.length; i++) {
            while (!stack.isEmpty() && nums2[i] > nums2[stack.peek()]) {
                int idx = stack.pop();
                map.put(nums2[idx], nums2[i]);
            }
            stack.push(i);
        }
        
        int[] answer = new int[nums1.length];
        for (int i=0; i<nums1.length; i++) {
            answer[i] = map.getOrDefault(nums1[i], -1);
        }
        return answer;
    }
}