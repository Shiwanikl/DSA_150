class Solution {
    public int[] maxDepthAfterSplit(String seq) {

        int n = seq.length();
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            if (seq.charAt(i) == '(') {

                int depth = st.size() + 1;

                ans[i] = depth % 2;

                st.push(ans[i]);
            }

            else {

                ans[i] = st.pop();
            }
        }

        return ans;
    }
}