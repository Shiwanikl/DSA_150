class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] res = new int[2];
        int a = 0 ;
        int b = n-1;
     while(a<b){
           if( numbers[a]+numbers[b] == target){
            return new int[]{a+1,b+1};
           }

          else if(numbers[a]+numbers[b]<target){
            a++;
           
           }
           else{
            b--;
           }
           

        }
        return res;
    }
}