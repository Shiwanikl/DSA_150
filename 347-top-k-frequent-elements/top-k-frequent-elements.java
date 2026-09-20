import java.util.*;

class Pair {
    int first;   // frequency
    int second;  // number

    Pair(int f, int s) {
        first = f;
        second = s;
    }
}

class Solution {

    // Min heap on first, Min on second
    static Comparator<Pair> minMin = (a, b) -> {
        if (a.first != b.first)
            return Integer.compare(a.first, b.first);
        return Integer.compare(a.second, b.second);
    };

    // Min heap on first, Max on second
    static Comparator<Pair> minMax = (a, b) -> {
        if (a.first != b.first)
            return Integer.compare(a.first, b.first);
        return Integer.compare(b.second, a.second);
    };

    // Max heap on first, Min on second
    static Comparator<Pair> maxMin = (a, b) -> {
        if (a.first != b.first)
            return Integer.compare(b.first, a.first);
        return Integer.compare(a.second, b.second);
    };

    // Max heap on first, Max on second
    static Comparator<Pair> maxMax = (a, b) -> {
        if (a.first != b.first)
            return Integer.compare(b.first, a.first);
        return Integer.compare(b.second, a.second);
    };

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // For top K frequent we need a MIN heap on first (frequency),
        // so the least frequent is on top and gets evicted.
        PriorityQueue<Pair> pq = new PriorityQueue<>(minMin);

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            pq.offer(new Pair(e.getValue(), e.getKey()));
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll().second;
        }
        return res;
    }
}