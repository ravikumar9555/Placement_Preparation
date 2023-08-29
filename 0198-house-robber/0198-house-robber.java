class Solution {
    public int helper(int [] nums,int ind,int[] dp){
        if(ind==nums.length-1){
            return nums[ind];
        }
        if(ind>=nums.length){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int pick=nums[ind]+helper(nums,ind+2,dp);
        int not_pick=helper(nums,ind+1,dp);
        return dp[ind]=Math.max(pick,not_pick);
    }
    public int rob(int[] nums) {
        int []dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return helper(nums,0,dp);
    }
}