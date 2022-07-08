class Solution {
    public List<List<Integer>> threeSum(int[] nums) {        
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        
        for (int first = 0; first < nums.length; first++) {
            if (nums[first] > 0) {
                break;
            }
            if (first != 0 && nums[first] == nums[first-1]) {
                continue;
            }
            int second = first + 1;
            int last = nums.length - 1;
            
            while (second < last) {
                int sum = nums[first] + nums[second] + nums[last];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[last]);
                    answer.add(list);
                    last--;
                    while(second < last && nums[second] == nums[second - 1]) {
                        second++;
                    }
                    while(second < last && nums[last] == nums[last + 1]) {
                        last--;
                    }
                } else if (sum < 0) {
                    second++;
                } else {
                    last--;
                }
            }
        }
        
        return answer;
    }
}