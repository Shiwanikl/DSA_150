class Solution {

    public void fun(String s, int n, int idx, StringBuilder diary,
                    List<String> res, HashMap<Character, String> hm) {

        // base case
        if (idx == n) {
            res.add(diary.toString());
            return;
        }

        String choice = hm.get(s.charAt(idx));

        for (int j = 0; j < choice.length(); j++) {

            diary.append(choice.charAt(j));       // push

            fun(s, n, idx + 1, diary, res, hm);   // recurse

            diary.deleteCharAt(diary.length() - 1); // pop
        }
    }

    public List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<>();

        if (digits.length() == 0) {
            return res;
        }

        HashMap<Character, String> hm = new HashMap<>();

        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");

        StringBuilder diary = new StringBuilder();

        fun(digits, digits.length(), 0, diary, res, hm);

        return res;
    }
}