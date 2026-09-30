class Solution {
    public void fun(String s, int idx, List<String> diary, List<List<String>> res) {
        // base case
        int n = s.length();

        if (idx == n) {
            res.add(new ArrayList<>(diary));
            return;
        }

        for (int i = idx; i < s.length(); i++) {
            String temp = s.substring(idx, i + 1);

            if (temp.equals(new StringBuilder(temp).reverse().toString())) {
                diary.add(temp);

                fun(s, i + 1, diary, res);

                diary.remove(diary.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> diary = new ArrayList<>();

        fun(s, 0, diary, res);

        return res;
    }
}