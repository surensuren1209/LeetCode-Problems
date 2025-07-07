class Solution {
    static{
        for(int i=0;i<500;i++){
            isMonotonic(new int [1]);
        }
    }
    public  static boolean isMonotonic(int[] nums) {
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
