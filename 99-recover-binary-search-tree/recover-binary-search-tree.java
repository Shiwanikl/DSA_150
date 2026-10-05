class Solution {
    ArrayList<Integer> res = new ArrayList<>();
    int i = 0;
    boolean change = false;

    public void fun(TreeNode root) {
        if (root == null) {
            return;
        }

        fun(root.left);

        if (!change) {
            res.add(root.val);
        } else {
            root.val = res.get(i++);
        }

        fun(root.right);
    }

    public void recoverTree(TreeNode root) {
        // 1. Inorder → store
        fun(root);

        // 2. Sort
        Collections.sort(res);

        // 3. Inorder → put sorted values back
        i = 0;
        change = true;
        fun(root);
    }
}