class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashSet<Integer> set = new HashSet<>();

        if(n == 1){
            return nums[0];
        }

        for(int i = 0; i < n; i++){
            if(set.contains(nums[i])){
                continue;
            }

            set.add(nums[i]);

            if(pq.size() < 3){
                pq.add(nums[i]);
            }
            else if(nums[i] > pq.peek()){
                pq.poll();
                pq.add(nums[i]);
            }
        }

        if(pq.size() < 3){
            while(pq.size() > 1){
                pq.poll();
            }
        }

        return pq.peek();
    }
}