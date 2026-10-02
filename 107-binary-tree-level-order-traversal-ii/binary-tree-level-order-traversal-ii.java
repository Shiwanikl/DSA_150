class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int levelsize = q.size();

            while (levelsize-- > 0) {
                TreeNode t = q.poll();

                temp.add(t.val);

                if (t.left != null) {
                    q.add(t.left);
                }

                if (t.right != null) {
                    q.add(t.right);
                }
            }

            res.add(temp);
        }

        Collections.reverse(res);

        return res;
    }
}