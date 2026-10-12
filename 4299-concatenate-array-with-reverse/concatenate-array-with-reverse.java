import java.util.Arrays;

class Solution {
    public void fun(int[] nums, int i, int j) {
        if (i >= j) return;

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        fun(nums, i + 1, j - 1);
    }

    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] newarr = new int[2 * n];
        int[] temp = nums.clone();

        fun(temp, 0, n - 1);

        for (int i = 0; i < n; i++) {
            newarr[i] = nums[i];
            newarr[i + n] = temp[i];
        }

        return newarr;
    }
}