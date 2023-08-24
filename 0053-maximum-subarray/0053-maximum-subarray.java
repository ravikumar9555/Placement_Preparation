class Solution {
    public int maxSubArray(int[] nums) {
        // int n=arr.length;
        //  long maxi = Long.MIN_VALUE; // maximum sum
        // long sum = 0;

        // for (int i = 0; i < n; i++) {

        //     sum += arr[i];

        //     if (sum > maxi) {
        //         maxi = sum;
        //     }

        //     // If sum < 0: discard the sum calculated
        //     if (sum < 0) {
        //         sum = 0;
        //     }
        // }
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;

        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;

        // return (int)maxi;
    }
}