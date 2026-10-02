class Solution {
    public boolean fun(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }

        if (root == null || subRoot == null) {
            return false;
        }

        if (root.val == subRoot.val) {
            boolean r1 = fun(root.left, subRoot.left);
            boolean r2 = fun(root.right, subRoot.right);

            if (r1 && r2) {
                return true;
            }
        }

        return false;
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (root == null) {
            return false;
        }

        if (fun(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }
}