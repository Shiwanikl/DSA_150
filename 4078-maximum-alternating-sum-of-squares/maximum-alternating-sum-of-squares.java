class Solution {
    public long maxAlternatingSum(int[] nums) {
        long res = 0;                                  // CHANGED: long, start at 0 (was int MIN_VALUE)
        
        for(int i = 0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];                 // CHANGED: square, not *2 (see overflow note below)
        }
        Arrays.sort(nums);
        int p1 = 0;
        int p2 = nums.length-1;
        for(int i =0 ; i<nums.length/2;i++){           // CHANGED: only n/2 pairs, so nothing is counted twice
            res += nums[p2]-nums[p1];                  // CHANGED: += and large minus small
            p1++;
            p2--;

        }
        if(nums.length % 2 == 1){                      // ADDED: odd n, the middle element goes to '+'
            res += nums[p1];
        }
        return res;
    }
}