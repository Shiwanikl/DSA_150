class Solution {
    public int fun(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = fun(root.left);
        int right = fun(root.right);

        if(root.left == null && root.right == null){
            return 1;
        }

        if(root.left == null){
            return right + 1;
        }

        if(root.right == null){
            return left + 1;
        }

        return Math.min(left, right) + 1;
    }

    public int minDepth(TreeNode root) {
        return fun(root);
    }
}