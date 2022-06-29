class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        } else if (m == 0) {
            for (int i=0; i<n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (nums1[i] <= nums2[j]) {
                    continue;
                }
                //System.out.println("nums1[i] : " + nums1[i]);
                //System.out.println("nums2[j] : " + nums2[j]);
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
            }
        }
        
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if (nums2[i]<nums2[j]) {
                    break;
                }
                int temp = nums2[i];
                nums2[i] = nums2[j];
                nums2[j] = temp;
                //System.out.println("temp : " + temp);
            }
            //System.out.println("nums2[i] : " + nums2[i]);
        }
        
        for (int num : nums1) {
            //System.out.println("num1 : " + num);
        }
        
        for (int num : nums2) {
            //System.out.println("num2 : " + num);
        }
        
        int idx = 0;
        for (int i=m; i<m+n; i++) {
            nums1[i] = nums2[idx++];
        }
    }
}