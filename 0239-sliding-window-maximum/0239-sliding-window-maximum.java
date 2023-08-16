class Solution {
	static class Pair implements Comparable<Pair>
	{
		int val;
		int idx;
		Pair(int val,int idx)
		{
			this.val=val;
			this.idx=idx;
		}

		@Override
		public int compareTo(Pair o) {
			
			return o.val-this.val;
		}
		
	}
    public int[] maxSlidingWindow(int[] nums, int k) {
        int res[]=new int[nums.length-k+1];
		
		
		//1st window
		PriorityQueue<Pair> pq=new PriorityQueue<>();
		for(int i=0;i<k;i++)
		{
			pq.add(new Pair(nums[i],i));
		}
		
		res[0]=pq.peek().val;
		
		
		for(int i=k;i<nums.length;i++)
		{
			while(pq.size()>0 && pq.peek().idx<=(i-k))
			{
				pq.remove();
			}
			pq.add(new Pair(nums[i],i));
			
			res[i-k+1]=pq.peek().val;
		}
		return res;
		
		
    }
}