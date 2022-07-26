class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }
        
        int[] store1 = new int[nums.length];
        int[] store2 = new int[nums.length];
        
        for (int i=0; i<nums.length-1; i++) {
            store1[i] = nums[i];
        }
        
        for (int i=0; i<nums.length-1; i++) {
            store2[i] = nums[i+1];
        }        

        store1[1] = Math.max(store1[0], store1[1]);
        store2[1] = Math.max(store2[0], store2[1]);

        for (int i = 2; i < store1.length; i++) {
            store1[i] = Math.max(store1[i - 1], store1[i - 2] + store1[i]);
        }
        
        for (int i = 2; i < store2.length; i++) {
            store2[i] = Math.max(store2[i - 1], store2[i - 2] + store2[i]);
        }
        
        System.out.println("store1[store1.length - 1] : " + store1[store1.length - 1]);
        System.out.println("store2[store2.length - 1] : " + store2[store2.length - 1]);
        

        return Math.max(store1[store1.length - 1], store2[store2.length - 1]);
    }
}