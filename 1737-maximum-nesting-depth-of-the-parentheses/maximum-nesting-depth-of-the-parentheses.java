class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int count = 0;
        int res =0;
        for(int i = 0;i<n;i++){
            if(s.charAt(i)=='('){
                count++;
                res = Math.max(count,res);

            }
            if(s.charAt(i)==')'){
                count--;
                
                
            }

        }
        return res;
        
    }
}