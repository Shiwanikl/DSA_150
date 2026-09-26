class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int max_fuel = startFuel;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int count = 0;
        int index = 0;

        while(max_fuel < target){
            while(index < stations.length && stations[index][0] <= max_fuel){
                pq.add(stations[index][1]);
                index++;
            }

            if(pq.isEmpty()){
                return -1;
            }

            max_fuel += pq.poll();
            count++;
        }

        return count;
    }
}