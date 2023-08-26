class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, 0, 0, inorder.length-1);
 
    }
    public TreeNode helper(int[] preorder, int[] inorder, int preidx, int insi, int inei){
        if(preidx > preorder.length-1 || insi > inei) return null;
            TreeNode root = new TreeNode(preorder[preidx]);
            int inidx = 0;
            for(int i = insi; i <= inei; i++){
                if(inorder[i] == root.val){
                    inidx = i;
                    break;
                }
            }
            root.left = helper(preorder, inorder, preidx+1, insi, inidx-1);
            root.right = helper(preorder, inorder, preidx + inidx - insi + 1, inidx + 1, inei);
            return root;
    }
}
