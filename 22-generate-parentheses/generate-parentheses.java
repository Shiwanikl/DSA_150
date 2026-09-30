class Solution {
    public void fun(int open, int close, StringBuilder temp, List<String> res, int n) {

        // base case
        if (open == n && close == n) {
            res.add(temp.toString());
            return;
        }

        // add opening bracket
        if (open < n) {
            temp.append('(');
            fun(open + 1, close, temp, res, n);
            temp.deleteCharAt(temp.length() - 1);
        }

        // add closing bracket
        if (close < open) {
            temp.append(')');
            fun(open, close + 1, temp, res, n);
            temp.deleteCharAt(temp.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        fun(0, 0, temp, res, n);

        return res;
    }
}