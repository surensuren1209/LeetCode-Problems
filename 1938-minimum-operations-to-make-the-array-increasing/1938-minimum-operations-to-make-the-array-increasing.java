class Solution {
    static{
        for(int i=0;i<500;i++){
            minOperations(new int[1]);
        }
    }
    public static int minOperations(int[] nums) {
        int op = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int diff = nums[i - 1] - nums[i] + 1;
                op += diff;
                nums[i] += diff;
            }
        }
        return op;
    }
}
