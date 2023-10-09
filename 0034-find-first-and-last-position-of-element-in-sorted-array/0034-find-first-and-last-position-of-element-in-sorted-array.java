class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};

        int l=0;
        int h=nums.length-1;
        //to  find first occurenece
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(target==nums[mid]){
                h=mid-1;
                ans[0]=mid;
            }
            else if(target>nums[mid])
            {
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        //to  find last occurenece
         l=0;
         h=nums.length-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(target==nums[mid]){
                l=mid+1;
                ans[1]=mid;
            }
            else if(target>nums[mid])
            {
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return ans;
    }
}