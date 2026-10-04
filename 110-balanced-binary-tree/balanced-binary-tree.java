class Solution {
    public int fun(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = fun(root.left);
        int right = fun(root.right);

        if (Math.abs(left - right) > 1) {
            return -1;
        }

        if (left == -1 || right == -1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        return fun(root) != -1;
    }
}