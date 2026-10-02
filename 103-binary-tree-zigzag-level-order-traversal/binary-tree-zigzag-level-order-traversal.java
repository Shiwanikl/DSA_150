class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelsize = q.size();
            List<Integer> temp = new ArrayList<>();

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

        for (int i = 0; i < res.size(); i++) {
            if (i % 2 == 1) {
                Collections.reverse(res.get(i));
            }
        }

        return res;
    }
}