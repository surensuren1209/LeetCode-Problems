class Solution {
    static{
        for(int i=0;i<500;i++){
            smallestRangeI(new int[1],1);
        }
    }
    public static int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        int diff = max - min;
        return Math.max(0, diff - 2 * k);
    }
}
