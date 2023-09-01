
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> ans= new ArrayList<>();
       if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
           double doubleans=0;
           int levelSize=q.size();
           for(int i=0; i<levelSize; i++){
             TreeNode currentNode = q.poll();
             doubleans+=currentNode.val;
             if(currentNode.left!=null) q.offer(currentNode.left);
             if(currentNode.right!=null) q.offer(currentNode.right);


           }
           doubleans=doubleans/levelSize;
           ans.add(doubleans);
        }
        return ans;
    }
}