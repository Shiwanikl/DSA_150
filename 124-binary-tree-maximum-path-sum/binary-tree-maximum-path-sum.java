class Solution {
    int res = Integer.MIN_VALUE;

    public int fun(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(0, fun(root.left));
        int right = Math.max(0, fun(root.right));

        int path = root.val + left + right;

        res = Math.max(res, path);

        return root.val + Math.max(left, right);
    }

    public int maxPathSum(TreeNode root) {
        fun(root);
        return res;
    }
}