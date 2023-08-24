class Solution {
    public int findDuplicate(int[] nums) {
        //   Map<Integer,Integer> mp=new HashMap<>();
        // for(int x: nums){
        //    if(mp.containsKey(x)){
        //         mp.put(x,mp.get(x)+1);
        //    }else{
        //        mp.put(x,1);
        //    }
        // }

        // for(int n:mp.keySet()){
        //     int val=mp.get(n);
        //     if(val>1){
        //         return n;
        //     }
        // }
        // return -1;
        int n = nums.length - 1;
    int left = 1;
    int right = n;
    
    while (left < right) {
        int mid = left + (right - left) / 2;
        
        int count = 0;
        for (int num : nums) {
            if (num <= mid) {
                count++;
            }
        }
        
        if (count > mid) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    
    return left;

    }
}