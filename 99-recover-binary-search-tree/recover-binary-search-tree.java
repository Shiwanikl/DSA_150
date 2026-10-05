class Solution {
    TreeNode prev = null;
    TreeNode firstwrong = null;
    TreeNode secondwrong = null;

    public void fun(TreeNode root) {
        if (root == null) {
            return;
        }

        fun(root.left);

        if (prev != null && prev.val > root.val) {
            if (firstwrong == null) {
                firstwrong = prev;
            }
            secondwrong = root;
        }

        prev = root;

        fun(root.right);
    }

    public void recoverTree(TreeNode root) {
        fun(root);

        int temp = firstwrong.val;
        firstwrong.val = secondwrong.val;
        secondwrong.val = temp;
    }
}