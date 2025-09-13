class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2];
        boolean[] seen = new boolean[n + 1];
        for (int num : nums) {
            if (seen[num]) {
                ans[0] = num; 
            }
            seen[num] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                ans[1] = i;
                break;
            }
        }

        return ans;
    }
}
