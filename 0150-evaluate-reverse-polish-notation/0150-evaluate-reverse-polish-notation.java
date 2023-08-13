class Solution {
    public int evalRPN(String[] tokens) {
         Stack<Integer> st = new Stack<>();
        int result = 0;
        
        HashMap<String, BinaryOperator<Integer>> mp = new HashMap<>();
        mp.put("+", (a, b) -> a + b);
        mp.put("-", (a, b) -> a - b);
        mp.put("*", (a, b) -> a * b);
        mp.put("/", (a, b) -> a / b);
        
        for (String s : tokens) {
            if (mp.containsKey(s)) {
                int b = st.pop();
                int a = st.pop();
                
                BinaryOperator<Integer> operator = mp.get(s);
                result = operator.apply(a, b);
                st.push(result);
            } else {
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}