class Solution {
    public int smallestIndex(int[] nums) {
       int n1 = nums.length;
         
      
        for(int i = 0 ;i< n1;i++){
              int sum = 0 ;
            int n = nums[i];
            while(n>0){
         
            sum = sum + n%10;
            n = n/10;
            
        }




        if(sum == i){
            return i;
        }
        }
        return -1;
    
        
    }
}