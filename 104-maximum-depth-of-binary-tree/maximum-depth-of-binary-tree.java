/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int fun(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = fun(root.left);
        int right = fun(root.right);
        if(root.left == null && root.right == null){
            return 1;
        }
        if(root.left == null){
            return right + 1;
        }
        if(root.right == null){
            return left + 1;
        }
        return Math.max(left,right)+1;
    }
    public int maxDepth(TreeNode root) {
        return fun(root);
        
    }
}