class NumArray {
    
    List<Integer> list = new ArrayList<>();

    public NumArray(int[] nums) {
        for (int num : nums) {
            list.add(num);
        }
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i<=right; i++) {
            sum += list.get(i);
        }
        
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */