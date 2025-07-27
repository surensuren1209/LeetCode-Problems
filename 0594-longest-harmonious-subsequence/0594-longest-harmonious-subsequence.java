class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);  
        int cnt = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] - nums[cnt] > 1)
                cnt++;

            if (nums[i] - nums[cnt] == 1)
                ans = Math.max(ans, i - cnt + 1);
        }

        return ans;
    }
}