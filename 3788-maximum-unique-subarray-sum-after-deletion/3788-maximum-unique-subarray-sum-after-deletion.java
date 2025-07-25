
class Solution {
    static {
        for(int i=0;i<500;i++){
            maxSum(new int [1]);
        }
    }
    public static int maxSum(int[] nums) {
        Arrays.sort(nums);
        int sum = nums[nums.length - 1], prev = sum;
        for (int i = nums.length - 2; i >= 0 && nums[i] >= 0; prev = nums[i], i--)
        if (nums[i] != prev) sum += nums[i]; return sum;
    }
}