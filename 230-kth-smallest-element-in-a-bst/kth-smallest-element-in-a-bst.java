class Solution {
    int count = 0;
    int ans = 0;

    public void fun(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        fun(root.left, k);

        count++;

        if (count == k) {
            ans = root.val;
            return;
        }

        fun(root.right, k);
    }

    public int kthSmallest(TreeNode root, int k) {
        fun(root, k);
        return ans;
    }
}