class Solution {
    public int maxPower(String s) {
         if (s == null || s.length() == 0) {
            return 0;
        }
        
        int maxPower = 1;
        int currentPower = 1;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentPower++;
                maxPower = Math.max(maxPower, currentPower);
            } else {
                currentPower = 1;
            }
        }
        
        return maxPower;
    }
}