class Solution {
    public boolean checkRecord(String s) {
        int count = 0;
        int late = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'A') {
                count++;
            }

            if (c == 'L') {
                late++;
            } else {
                late = 0;
            }

            if (count >= 2 || late >= 3) {
                return false;
            }
        }

        return true;
    }
}