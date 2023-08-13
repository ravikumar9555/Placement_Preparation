class Solution {
    public String removeStars(String s) {
        
        StringBuffer sb=new StringBuffer();
       
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='*'){
              sb.deleteCharAt(sb.length() - 1);
            }else{
                 sb.append(ch);
            }
        }

        return sb.toString();

    }
}