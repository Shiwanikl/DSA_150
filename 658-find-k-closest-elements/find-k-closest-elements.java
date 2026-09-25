class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return b[0] - a[0];
            }
            return b[1] - a[1];
        });

        for (int i = 0; i < arr.length; i++) {
            int dist = Math.abs(arr[i] - x);

            pq.add(new int[]{dist, i});

            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            int index = pq.poll()[1];
            res.add(arr[index]);
        }

        Collections.sort(res);

        return res;
    }
}