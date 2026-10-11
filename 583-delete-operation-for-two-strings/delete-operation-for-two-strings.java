class Solution {
    int[][] dp;
    public int minDistance(String word1, String word2) {
        dp = new int[word1.length()][word2.length()];
        for(int [] row : dp){
            java.util.Arrays.fill(row, -1);
        }
        return solve(word1, word2, 0, 0);
    }

    int solve(String w1, String w2, int p1, int p2) {
        if (p1 == w1.length()) return w2.length() - p2;
        if (p2 == w2.length()) return w1.length() - p1;
        if (dp[p1][p2] != -1) return dp[p1][p2];

        if (w1.charAt(p1) == w2.charAt(p2)) {
            return solve(w1, w2, p1 + 1, p2 + 1);
        }

        return dp[p1][p2]= Math.min(
            1 + solve(w1, w2, p1 + 1, p2),
            1 + solve(w1, w2, p1, p2 + 1)
        );
    }
}