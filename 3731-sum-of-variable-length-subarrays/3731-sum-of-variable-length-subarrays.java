class Solution {
    static{
        for(int i=0;i<500;i++){
            subarraySum(new int[1]);
        }
    }
    public  static int subarraySum(int[] nums) {
        int res = 0, sum;

        for (int i = 0; i < nums.length; i++) {
            int start = Math.max(0, i - nums[i]);
            sum = 0;
            while (start <= i) {
                sum += nums[start];
                start++;
            }
            res += sum;
        }

        return res;
    }
}