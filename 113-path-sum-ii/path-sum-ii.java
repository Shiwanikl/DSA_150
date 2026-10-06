class Solution {
    public void fun(TreeNode root, int targetSum, int sum,
                    List<Integer> path, List<List<Integer>> ans) {

        if (root == null) {
            return;
        }

        sum += root.val;
        path.add(root.val);

        if (root.left == null && root.right == null) {
            if (sum == targetSum) {
                ans.add(new ArrayList<>(path));
            }
            path.remove(path.size() - 1);
            return;
        }

        fun(root.left, targetSum, sum, path, ans);
        fun(root.right, targetSum, sum, path, ans);

        path.remove(path.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        fun(root, targetSum, 0, path, ans);

        return ans;
    }
}