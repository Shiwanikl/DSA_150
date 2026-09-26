class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a, b) -> a[1] - b[1]);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int sum = 0;

        for (int i = 0; i < courses.length; i++) {
            int duration = courses[i][0];
            int deadline = courses[i][1];

            sum += duration;
            pq.add(duration);

            if (sum > deadline) {
                sum -= pq.poll();
            }
        }

        return pq.size();
    }
}