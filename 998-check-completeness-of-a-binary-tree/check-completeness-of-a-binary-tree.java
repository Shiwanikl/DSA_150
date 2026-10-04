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
    boolean Nodeseen;
    public boolean fun(TreeNode root){
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode t = q.remove();
            if(t == null){
                Nodeseen = true;
            }
            else{
                if(Nodeseen){
                    return false;
                }
                q.add(t.left);
                q.add(t.right);

            }
            
        }
        return true;

    }
    public boolean isCompleteTree(TreeNode root) {
        return fun(root);


        
    }
}