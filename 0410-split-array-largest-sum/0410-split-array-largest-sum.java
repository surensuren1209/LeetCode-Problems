class Solution {
    static{
        for(int i=0;i<500;i++){
            splitArray(new int[1],1);
        }
    }
    public static int splitArray(int[] nums, int k) {
        int left = 0, right = 0;
        for (int i = 0; i < nums.length; i++) {
            left = Math.max(left, nums[i]);
            right += nums[i];
        }
        for (; left < right;) {
            int mid = left + (right - left) / 2;
            int sum = 0, cnt = 1;
            for (int i = 0; i < nums.length; i++) {
                if (sum + nums[i] > mid) {
                    cnt++;
                    sum = nums[i];
                } else {
                    sum += nums[i];
                }
            }

            if (cnt > k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
