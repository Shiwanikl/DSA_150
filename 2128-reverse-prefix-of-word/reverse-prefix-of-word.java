class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.length();

        for (int i = 0; i < n; i++) {
            if (word.charAt(i) == ch) {
                StringBuilder st = new StringBuilder(word.substring(0, i + 1));
                st.reverse();

                return st.toString() + word.substring(i + 1);
            }
        }

        return word;
    }
}