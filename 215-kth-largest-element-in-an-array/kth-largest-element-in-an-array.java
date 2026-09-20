class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = nums.length;
        for(int i = 0 ; i<k;i++){
            pq.add(nums[i]);
        }
        for(int i = k ; i < n ;i++){
            if(pq.peek()<nums[i]){
                pq.poll();
                pq.add(nums[i]);
            }
            else{
                continue;
            }
            
        }
        return pq.peek();
        
    }
}
/**
we want kth largest , ---> use min heap 
take k size elements from array and put in min heap
then compare remaining eleements
if peek()<arr[i] replace pollelement from heap and add arr[i]
return the top




in java we use
pq.add()
pq.poll()
pq.peek()




 */