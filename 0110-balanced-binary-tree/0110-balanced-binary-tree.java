
class Solution {
    public int height(TreeNode root){
        if(root==null || (root.left==null && root.right==null)){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        int left=height(root.left);
        if(root.left!=null)left++;
        int right=height(root.right);
        
        if(root.right!=null)right++;
        int d=left-right;
        if(d<0)d=-d;
        if(d>1)return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}