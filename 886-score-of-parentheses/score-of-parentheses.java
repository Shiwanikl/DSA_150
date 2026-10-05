class Solution {
    public int scoreOfParentheses(String s) {
        int var = 0;
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(0);
            } 
            else {
                var = st.pop();

                if (var == 0) {
                    var = 1;
                } 
                else {
                    var = var * 2;
                }

                st.push(st.pop() + var);
            }
        }

        return st.pop();
    }
}