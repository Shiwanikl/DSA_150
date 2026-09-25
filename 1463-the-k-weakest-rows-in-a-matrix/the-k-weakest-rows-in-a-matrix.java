class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return b[0] - a[0];
            }
            return b[1] - a[1];
        });

        for (int i = 0; i < mat.length; i++) {
            int sum = 0;

            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }

            pq.add(new int[]{sum, i});

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] res = new int[k];

        for (int m = k - 1; m >= 0; m--) {
            res[m] = pq.poll()[1];
        }

        return res;
    }
}