class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int[][] projects = new int[profits.length][2];

        for (int i = 0; i < profits.length; i++) {
            projects[i][0] = capital[i];
            projects[i][1] = profits[i];
        }

        Arrays.sort(projects, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int i = 0;

        for (int j = 0; j < k; j++) {

            while (i < projects.length && projects[i][0] <= w) {
                pq.add(projects[i][1]);
                i++;
            }

            if (pq.isEmpty()) {
                break;
            }

            w += pq.poll();
        }

        return w;
    }
}