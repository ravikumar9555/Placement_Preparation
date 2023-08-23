class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int x = nums1.length;
    int y = nums2.length;

    int i = 0;
    int j = 0;
    int k = 0;
    int[] ans = new int[x + y];

    while (i < x && j < y) {
        if (nums1[i] < nums2[j]) {
            ans[k] = nums1[i];
            i++;
            k++;
        } else {
            ans[k] = nums2[j];
            j++;
            k++;
        }
    }
    while (i < x) {
        ans[k] = nums1[i];
        i++;
        k++;
    }
    while (j < y) {
        ans[k] = nums2[j];
        j++;
        k++;
    }

    int mid = ans.length;
    int z = mid / 2;
    double median = 0.0;

    if (mid % 2 == 0) {
        median = (ans[z] + ans[z - 1]) / 2.0;
    } else {
        median = ans[z];
    }

    return median;
      
}}