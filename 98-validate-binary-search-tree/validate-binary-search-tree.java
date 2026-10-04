
class Solution {
    Long min = Long.MIN_VALUE;
    Long max = Long.MAX_VALUE;
    public boolean fun(TreeNode root , Long min ,Long max ){
        if(root == null){
            return true;
        }
        if(root.val<=min || root.val>=max){
            return false;
        }
       
        boolean left = fun(root.left, min, (long)root.val);
        boolean right = fun(root.right, (long)root.val, max);


        return left && right ;



    }
    public boolean isValidBST(TreeNode root) {
        return fun(root,min , max);
        
    }
}