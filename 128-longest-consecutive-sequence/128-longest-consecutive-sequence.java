class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return 1;
        }
        TreeSet<Integer> tree = new TreeSet<>();
        for (int num : nums) {
            tree.add(num);
        }
        int count = 1;
        int maxCount = 0;
        int pre = tree.first();
        Iterator iter = tree.iterator();
        while(iter.hasNext()) {
            int i = (int)iter.next();
            if (i==pre) {
                continue;
            }
            if (i == pre+1) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 1;
            }
            pre = i;
        }
        return Math.max(count, maxCount);
    }
}