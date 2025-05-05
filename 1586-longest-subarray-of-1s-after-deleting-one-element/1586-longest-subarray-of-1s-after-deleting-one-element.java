class Solution {
    public int longestSubarray(int[] nums) {
         int i = 0, j = 0;
        int lastZeroIndex = -1;
        int result = 0;

        while (j < nums.length) {
            if (nums[j] == 0) {
                i = lastZeroIndex + 1;  // shrink window to exclude previous 0
                lastZeroIndex = j;      // update last zero seen
            }

            result = Math.max(result, j - i);  // update max length (excluding one zero)
            j++;
        }

        return result;
    }
}