
//Approach-1 (Using Max-heap)
class Solution {
    public String reorganizeString(String S) {

        Map<Character, Integer> map = new HashMap<>();
        for (char c : S.toCharArray()) {
            int count = map.getOrDefault(c, 0) + 1;
         
            if (count > (S.length() + 1) / 2) 
                return "";
            
            map.put(c, count);
        }

        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (char c : map.keySet()) {
            pq.add(new int[] {map.get(c), c});
        }
        
        // Build the result.
        StringBuilder sb = new StringBuilder();
        while (pq.size() >= 2) {
            int[] first  = pq.poll();
            int[] second = pq.poll();
            
            sb.append((char) first[1]);
            sb.append((char) second[1]);
            
            first[0]--;
            second[0]--;
            
            if(first[0] > 0)
                pq.add(first);
            
            if(second[0] > 0)
                pq.add(second);

        }
        if(!pq.isEmpty()) {
            int[] first  = pq.poll();
            
            sb.append((char) first[1]);
        }
        
        return sb.toString();
    }
}