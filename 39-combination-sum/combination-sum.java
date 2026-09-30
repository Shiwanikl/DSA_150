class Solution {
    public void fun(int[] candidates ,int n, int target,int idx,List<List<Integer>> res , List<Integer> diary){
         n = candidates.length;
        //base case
        if(target == 0){
            res.add(new ArrayList<> (diary));
            return;
        }
        if(idx == n || target<0){
            return;
        }
        //take and element
        diary.add(candidates[idx]);
        fun(candidates,n,target-candidates[idx],idx,res,diary);
        diary.remove(diary.size()-1);

        // dont take and element
        fun(candidates,n,target,idx+1,res,diary);


       

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> diary = new ArrayList<>();
        int n = candidates.length;

        fun(candidates,n,target,0,res,diary);
        return res;
        
    }
}