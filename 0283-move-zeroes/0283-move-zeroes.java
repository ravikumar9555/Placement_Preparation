class Solution {
   public void moveZeroes(int[] nums) {
    int n = nums.length;
    int nz = 0; // Initialize nz to 0
    int z = 0;  // Initialize z to 0
    while (nz < n) {
        if (nums[nz] != 0) {
            int temp = nums[nz];
            nums[nz] = nums[z];
            nums[z] = temp;
            nz++;
            z++;
        } else {
            nz++;
        }
    }
}

}