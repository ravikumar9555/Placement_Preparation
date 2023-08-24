class Solution {
    public int findDuplicate(int[] nums) {
          Map<Integer,Integer> mp=new HashMap<>();
        for(int x: nums){
           if(mp.containsKey(x)){
                mp.put(x,mp.get(x)+1);
           }else{
               mp.put(x,1);
           }
        }

        for(int n:mp.keySet()){
            int val=mp.get(n);
            if(val>1){
                return n;
            }
        }
        return -1;

    }
}