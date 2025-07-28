class Solution {
    int max = 0, cnt = 0;

    public int countMaxOrSubsets(int[] nums) {
        for (int num : nums) max |= num; 
        helper(nums, 0, 0);
        return cnt;
    }

    void helper(int[] nums, int i, int r) {
        if (i == nums.length) {
            if (r == max) cnt++;
            return;
        }
        helper(nums, i + 1, r | nums[i]); 
        helper(nums, i + 1, r);           
    }
}
