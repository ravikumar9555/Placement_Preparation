class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;

        if (k == 0) return nums;

        int[] result = new int[n];
        Arrays.fill(result, -1);  // fixed typo here

        if (n < 2 * k + 1) return result;

        long windowSum = 0;  // use long to prevent overflow

        int left = 0;
        int right = 2 * k;
        int i = k;

        for (int j = left; j <= right; j++) {
            windowSum += nums[j];
        }

        result[i] = (int)(windowSum / (2 * k + 1));

        i++;
        right++;

        while (right < n) {
            windowSum = windowSum - nums[left] + nums[right];
            result[i] = (int)(windowSum / (2 * k + 1));
            i++;
            left++;
            right++;
        }

        return result;
    }
}