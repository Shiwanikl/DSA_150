class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }

    public int dfs(TreeNode root, int maxVal) {
        if (root == null) {
            return 0;
        }

        int count = 0;

        if (root.val >= maxVal) {
            count = 1;
        }

        maxVal = Math.max(maxVal, root.val);

        count += dfs(root.left, maxVal);
        count += dfs(root.right, maxVal);

        return count;
    }
}
