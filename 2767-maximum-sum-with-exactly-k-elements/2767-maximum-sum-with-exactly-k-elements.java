class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return k * max + (k * (k - 1)) / 2;
    }
}
