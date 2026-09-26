class Solution {
    public String reorganizeString(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char c : s.toCharArray())
            hm.put(c, hm.getOrDefault(c, 0) + 1);

        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a, b) -> hm.get(b) - hm.get(a)
        );

        pq.addAll(hm.keySet());

        StringBuilder ans = new StringBuilder();

        while (pq.size() > 1) {
            char a = pq.poll();
            char b = pq.poll();

            ans.append(a).append(b);

            hm.put(a, hm.get(a) - 1);
            hm.put(b, hm.get(b) - 1);

            if (hm.get(a) > 0) pq.add(a);
            if (hm.get(b) > 0) pq.add(b);
        }

        if (!pq.isEmpty()) {
            char c = pq.poll();
            if (hm.get(c) > 1) return "";
            ans.append(c);
        }

        return ans.toString();
    }
}