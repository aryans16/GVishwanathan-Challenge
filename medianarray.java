import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int size = m + n;
        int[] merged = new int[size];
        System.arraycopy(nums1, 0, merged, 0, m);
        System.arraycopy(nums2, 0, merged, m, n);

        Arrays.sort(merged);
        double median;
        if(size % 2 == 0){
            median = (merged[size/2] + merged[size/2 - 1]) / 2.0;
        } else {
            median = merged[size/2];
        }
        return median;
    }

    public static void main(String[] args){
        Solution sol = new Solution();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(sol.findMedianSortedArrays(nums1, nums2)); // Output: 2.0
    }


}