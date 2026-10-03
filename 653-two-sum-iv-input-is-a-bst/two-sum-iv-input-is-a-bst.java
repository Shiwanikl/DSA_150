class Solution {
    public void fun(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        fun(root.left, list);
        list.add(root.val);
        fun(root.right, list);
    }

    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        fun(root, list);

        int i = 0;
        int j = list.size() - 1;

        while (i < j) {
            int sum = list.get(i) + list.get(j);

            if (sum == k) {
                return true;
            }

            if (sum < k) {
                i++;
            } else {
                j--;
            }
        }

        return false;
    }
}