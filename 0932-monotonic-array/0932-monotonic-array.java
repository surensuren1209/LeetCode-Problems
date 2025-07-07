class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dnc = true;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i - 1]) {
                dnc = false;
            }
            if(nums[i] < nums[i - 1]) {
                inc = false;
            }
        }

        return inc || dnc;
    }
}
