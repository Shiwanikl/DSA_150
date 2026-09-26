class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int i = 0;i<n;i++){
            pq.add(stones[i]);
            

        }
        while(pq.size()>1){
           int a = pq.poll();
           int b = pq.poll();
           if(a!=b){
            pq.add(a-b);
           }
           

       
        }
        if(pq.size()==0){
            return 0;
        }
        return pq.peek();
        
    }
}