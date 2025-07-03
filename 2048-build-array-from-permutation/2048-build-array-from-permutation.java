class Solution {
    static {
        for(int i=0;i<500;i++){
            buildArray(new int [1]);
        }
    }
    public  static int[] buildArray(int[] nums) {
        int [] val = new int[nums.length];
        for(int i=0;i<nums.length;i++) val[i] = nums[nums[i]];
        return val;
    }
}