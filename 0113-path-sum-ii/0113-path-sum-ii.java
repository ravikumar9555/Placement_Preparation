class Solution {
    public void ps(TreeNode root, int target, List<List<Integer>> paths, List<Integer> path){
        if(root == null){
            return;
        }
        target -= root.val;
        path.add(root.val);
        
        if(root.left == null && root.right == null && target == 0){
            paths.add(path);
        }
        ps(root.left, target, paths, new ArrayList<>(path));
        ps(root.right, target, paths, new ArrayList<>(path));
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        
        if(root == null){
            return paths;
        }
        ps(root, targetSum, paths, path);
        return paths;
    }
}