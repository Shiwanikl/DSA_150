import java.util.*;

class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int x : nums) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> a.second - b.second
        );

        Iterator<Map.Entry<Integer, Integer>> it = hm.entrySet().iterator();

        // First k pairs
        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> entry = it.next();
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }

        // Remaining pairs
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> entry = it.next();

            int element = entry.getKey();
            int freq = entry.getValue();

            if (freq > pq.peek().second) {
                pq.poll();
                pq.add(new Pair(element, freq));
            }
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().first;
        }

        return ans;
    }
}