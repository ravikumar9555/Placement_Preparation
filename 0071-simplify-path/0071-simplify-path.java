// class Solution {
//     public String simplifyPath(String path) {
//          Deque<String> stack = new LinkedList<>();
//     Set<String> skip = new HashSet<>(Arrays.asList("..",".",""));
//     for (String dir : path.split("/")) {
//         if (dir.equals("..") && !stack.isEmpty()) stack.pop();
//         else if (!skip.contains(dir)) stack.push(dir);
//     }
//     String res = "";
//     for (String dir : stack) res = "/" + dir + res;
//     return res.isEmpty() ? "/" : res;
//     }
// }
import java.util.*;
class Solution {
    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();
        StringTokenizer st=new StringTokenizer(path,"/");
        while(st.hasMoreTokens())
        {
            String s=st.nextToken();
            System.out.println(s);
            if(s.equals(" ")|| s.equals("."))
                continue;               
            else if(s.equals(".."))
            {
                if(!stack.isEmpty())
                    stack.pop();
            }           
            else
                stack.push(s);        
        }
        String ans="";
        for(String str:stack)
        {
            ans=ans+"/"+str;
        }
        if(ans.equals("")) return "/";
        return ans;
    }
}