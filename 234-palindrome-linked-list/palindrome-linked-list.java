class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        ListNode curr = head;

        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        ArrayList<Integer> rev = new ArrayList<>(list);
        Collections.reverse(rev);

        return list.equals(rev);
    }
}