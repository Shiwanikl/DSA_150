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
    boolean fun(TreeNode left , TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        if(left.val!=right.val){
            return false;
        }
        boolean r1 = fun(left.left, right.right);
        boolean r2 = fun(left.right, right.left);
        if(r1 && r2){
            return true;
        }
        return false;
    }
    public boolean isSymmetric(TreeNode root) {
        

       return fun(root.left , root.right);
        
    }
}