class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0 ; i<tasks.length;i++){
            hm.put(tasks[i], hm.getOrDefault(tasks[i],0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int count : hm.values()){
            pq.add(count);
        }

        int time = 0;

        while(!pq.isEmpty()){
            int cycle = n+1;
            List<Integer> temp = new ArrayList<>();

            for(int i = 0; i<cycle; i++){
                if(!pq.isEmpty()){
                    int cnt = pq.poll();
                    if(cnt - 1 > 0){
                        temp.add(cnt-1);
                    }
                }
                time++;

                if(pq.isEmpty() && temp.isEmpty()){
                    break;
                }
            }

            pq.addAll(temp);
        }

        return time;
    }
}