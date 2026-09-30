class Solution {


    public void fun(int[] nums , int n , List<Integer> diary, List<List<Integer>> res, int idx){
        if(idx == n){
            res.add(new ArrayList<> (diary));
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(!diary.contains(nums[i])){
        diary.add(nums[i]);
        fun(nums,n,diary,res,idx+1);
        diary.remove(diary.size()-1);
        }
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> diary = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        fun(nums,n,diary,res,0);
        return res;


        
    }
}