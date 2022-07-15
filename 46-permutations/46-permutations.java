class Solution {
    List<List<Integer>> list = new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        perm(nums, 0, nums.length, nums.length);
        return list;
    }
    
    void perm(int[] arr, int depth, int n, int r) {
        if (depth == r) {
            List<Integer> temp = new ArrayList<>();
            for (int num : arr) {
                temp.add(num);
            }
            list.add(temp);
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, i, depth);
            perm(arr, depth + 1, n, r);
            swap(arr, i, depth);
        }
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}